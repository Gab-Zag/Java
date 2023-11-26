package org.example.DAO;

import org.example.Model.Curso;
import org.example.Model.Gerente;
import org.example.Model.Usuario;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

public class GerenteDAO extends ConnectionDAO {
    static boolean sucesso = false;

    //Inserir o gerente
    public static boolean insertUser(Gerente user){
        connectToDB();

        String sql = "INSERT INTO Gerente (Nome,Email,Telefone,Senha) values(?,?,?,?)";
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

    //validar credenciais do gerente para login
    public Gerente validarCredenciais(String email, String senha) {
        String sql = "SELECT nome, email, telefone, senha FROM Gerente WHERE email = ? AND senha = ?";
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

                    // Criação de uma instância de gerente com os dados recuperados
                    Gerente gerente = new Gerente(nome, email, telefone, senha);
                    return gerente;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null; // Retorna null se as credenciais forem inválidas ou ocorrer um erro
    }

    public boolean verificarRegistros(){
        String sql = "SELECT * FROM Gerente";
        connectToDB();
        try {
            pst = con.prepareStatement(sql);
            pst.execute();

            try (ResultSet resultSet = pst.executeQuery()) {
                if (resultSet.next()) {
                    return true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
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

    //Atualizar os dados do gerente
    private boolean updateEmployeeField(String field, String newValue, String identifierField, String identifierValue) {
        connectToDB();
        String sql = "UPDATE Gerente SET " + field + "=? WHERE " + identifierField + "=?";

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

    //Obter o Id do Gerente utilizando o Email dele
    private int obterIdGerentePorEmail(String email) {
        String sql = "SELECT id FROM Gerente WHERE email = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, email);
            var rs = pst.executeQuery();

            if (rs.next()) {
                return rs.getInt("id");
            } else {
                return -1; // Retorna -1 se o Gerente não for encontrado
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }

    //deletar Gerente
    public boolean deleterUser(String email){
        connectToDB();

        String sql = "DELETE FROM Gerente Where email=?";
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

    //vertodos os alunos
    public ArrayList<Usuario> VerTodosOsAlunos() {
        ArrayList<Usuario> users = new ArrayList<>();
        connectToDB();
        String sql = "SELECT * FROM aluno";
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("Lista de users: ");
            while (rs.next()) {
                Usuario userAux = new Usuario(rs.getString("nome"), rs.getString("email"), rs.getInt("telefone"), rs.getString("senha")) {
                    @Override
                    public void mostrarInfo() {

                    }

                    @Override
                    public String getCurso() {
                        return null;
                    }
                };
                System.out.println("nome = " + userAux.getNome());
                System.out.println("email = " + userAux.getEmail());
                System.out.println("telefone = " + userAux.getTelefone());
                System.out.println("--------------------------------");
                users.add(userAux);
            }
            sucesso = true;
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                st.close();
            } catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        return users;
    }

    //Inserir Cursos
    public boolean AdicionarCurso(Curso curso){
        connectToDB();

        String sql = "INSERT INTO Curso (nome,descricao,tempo,quantidadeDeAlunos,id) values(?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, curso.getNome());
            pst.setString(2, curso.getDescricao());
            pst.setInt(3, curso.getTempo());
            pst.setInt(4,curso.getQuantidade_alunos());
            pst.setInt(5,curso.getID());
            pst.execute();
            sucesso = true;
        }catch (SQLException exc){
            System.out.println("Erro: " + exc.getMessage());
            sucesso = false;
        }finally {
    }
        try {
            con.close();
            pst.close();
        }catch (SQLException exc){
            System.out.println("Erro: " + exc.getMessage());
        }
        return sucesso;
    }

    //vertodos os Professores
    public ArrayList<Usuario> VerTodosOsProfessores() {
        ArrayList<Usuario> users = new ArrayList<>();
        connectToDB();
        String sql = "SELECT * FROM Professor";
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("Lista de users: ");
            while (rs.next()) {
                Usuario userAux = new Usuario(rs.getString("nome"), rs.getString("email"), rs.getInt("telefone"), rs.getString("senha")) {
                    @Override
                    public void mostrarInfo() {

                    }

                    @Override
                    public String getCurso() {
                        return null;
                    }
                };
                System.out.println("nome = " + userAux.getNome());
                System.out.println("email = " + userAux.getEmail());
                System.out.println("telefone = " + userAux.getTelefone());
                System.out.println("--------------------------------");
                users.add(userAux);
            }
            sucesso = true;
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                st.close();
            } catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        return users;
    }

    //vertodos os Cursos
    public ArrayList<Curso> VerTodosOsCursos() {
        ArrayList<Curso> cursos = new ArrayList<>();
        connectToDB();
        String sql = "SELECT * FROM Curso";
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("Lista de cursos: ");
            while (rs.next()) {
                Curso cursoAUX = new Curso(rs.getString("nome"), rs.getString("descricao"), rs.getInt("tempo"), rs.getInt("quantidadeDeAlunos"), rs.getInt("id"));
                System.out.println("Nome = " + cursoAUX.getNome());
                System.out.println("Descrição = " + cursoAUX.getDescricao());
                System.out.println("Tempo de curso = " + cursoAUX.getTempo() + " Messes");
                System.out.println("Quantidade de Alunos = " + cursoAUX.getQuantidade_alunos());
                System.out.println("id do curso = " + cursoAUX.getID());
                System.out.println("--------------------------------");
                cursos.add(cursoAUX);
            }
            sucesso = true;
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                st.close();
            } catch (SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        return cursos;
    }
}
