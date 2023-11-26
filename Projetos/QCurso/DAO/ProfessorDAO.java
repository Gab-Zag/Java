package org.example.DAO;

import org.example.Model.Aluno;
import org.example.Model.Professor;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProfessorDAO extends ConnectionDAO{
    static boolean sucesso = false;//saber se funcionou

    public boolean insertUser(Professor user){

        connectToDB();

        String sql = "INSERT INTO Professor (Nome,Email,Telefone,Senha) values(?,?,?,?)";
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

    public Professor validarCredenciais(String email, String senha){
        String sql = "Select nome, email, telefone, senha From Professor WHERE email = ? AND senha = ?";
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

                    // Criação de uma instância de Professor com os dados recuperados
                    Professor professor = new Professor(nome, email,telefone,senha);
                    return professor;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean deleterUser(String email){
        connectToDB();

        String sql = "DELETE FROM Professor Where email=?";
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

    public boolean inscreverProfessorEmCurso(int cursoId, String emailProfessor) {
        String sql = "INSERT INTO ministrada(professor_id, curso_id) VALUES (?,?)";

        try {
            pst = con.prepareStatement(sql);

            // Obtém o ID do aluno pelo email
            String professorId = String.valueOf(emailProfessor);

            if (!professorId.equals("")) {
                pst.setString(1, professorId);
                pst.setInt(2, cursoId);

                int linhasAfetadas = pst.executeUpdate();
                return linhasAfetadas > 0; // Retorna true se pelo menos uma linha foi afetada (inscrição realizada com sucesso)
            } else {
                System.out.println("Professor com o email " + emailProfessor + " não encontrado.");
                return false;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}
