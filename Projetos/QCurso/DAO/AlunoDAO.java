package org.example.DAO;

import org.example.Model.Aluno;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AlunoDAO extends ConnectionDAO {
    boolean sucesso = false; //Para saber se funcionou

    public boolean insertUser(Aluno user) {
        connectToDB();

        String sql = "INSERT INTO aluno (Nome,Email,Telefone,Senha) values(?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, user.getNome());
            pst.setString(2, user.getEmail());
            pst.setInt(3, user.getTelefone());
            pst.setString(4, user.getSenha());
            pst.execute();
            sucesso = true;
        } catch (SQLException exc) {
            System.out.println("Erroo: " + exc.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }

    public Aluno validarCredenciais(String email, String senha) {
        String sql = "SELECT nome, email, telefone, senha FROM aluno WHERE email = ? AND senha = ?";
        connectToDB();

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, email);
            pst.setString(2, senha);
            pst.execute();

            try (ResultSet resultSet = pst.executeQuery()) {
                if (resultSet.next()) {
                    String nome = resultSet.getString("nome");
                    int telefone = resultSet.getInt("telefone");

                    // Criação de uma instância de Aluno com os dados recuperados
                    Aluno aluno = new Aluno(nome, email, telefone, senha);
                    return aluno;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null; // Retorna null se as credenciais forem inválidas ou ocorrer um erro
    }

    public boolean updateEmployeeName(String email, String newName) {
        return updateEmployeeField("nome", newName, "email", email);
    }

    public boolean updateEmployeeEmail(String email, String newEmail) {
        return updateEmployeeField("email", newEmail, "email", email);
    }

    public boolean updateEmployeeTelefone(String email, String newTelefone) {
        return updateEmployeeField("telefone", newTelefone, "email", email);
    }

    public boolean updateEmployeeSenha(String email, String newSenha) {
        return updateEmployeeField("senha", newSenha, "email", email);
    }

    private boolean updateEmployeeField(String field, String newValue, String identifierField, String identifierValue) {
        connectToDB();
        String sql = "UPDATE Aluno SET " + field + "=? WHERE " + identifierField + "=?";
        System.out.println("Digite o novo " + field + " :");
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, newValue);
            pst.setString(2, identifierValue);

            pst.execute();
            sucesso = true;
        } catch (SQLException ex) {
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }

    public boolean inscreverAlunoEmCurso(int cursoId, String emailAluno) {
        String sql = "INSERT INTO inscricoes (aluno_id, curso_id) VALUES (?,?)";

        try {
            pst = con.prepareStatement(sql);

            // Obtém o ID do aluno pelo email
            String alunoId = String.valueOf(emailAluno);

            if (!alunoId.equals("")) {
                pst.setString(1, alunoId);
                pst.setInt(2, cursoId);

                int linhasAfetadas = pst.executeUpdate();
                return linhasAfetadas > 0; // Retorna true se pelo menos uma linha foi afetada (inscrição realizada com sucesso)
            } else {
                System.out.println("Aluno com o email " + emailAluno + " não encontrado.");
                return false;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deleterUser(String email){
        connectToDB();

        String sql = "DELETE FROM aluno Where email=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, email);
            pst.execute();
            sucesso = true;
        }catch (SQLException ex){
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        }finally {
            try {
                con.close();
                pst.close();
            }catch (SQLException exc){
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }
}
