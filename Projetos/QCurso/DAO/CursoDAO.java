package org.example.DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import org.example.Model.Curso;
public class CursoDAO extends ConnectionDAO{
    //DAO - Data Access Object
    boolean sucesso = false; //Para saber se funcionou
    public ArrayList<Curso> selectCursos() {
        ArrayList<Curso> cursos = new ArrayList<>();
        connectToDB();
        String sql = "SELECT c.id, c.nome AS Nome, c.Descricao, c.Tempo, COUNT(i.aluno_id) AS Quantidade_alunos " +
                "FROM curso c " +
                "LEFT JOIN inscricoes i ON c.id = i.curso_id " +
                "GROUP BY c.id, c.nome";
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);

            System.out.println("Lista de cursos: ");

            while (rs.next()) {
                Curso cursoAux = new Curso(
                        rs.getString("Nome"),
                        rs.getString("Descricao"),
                        rs.getInt("Tempo"),
                        rs.getInt("Quantidade_alunos"),
                        rs.getInt("id"));

                System.out.println("Nome do Curso: " + cursoAux.getNome());
                System.out.println("Descrição: " + cursoAux.getDescricao());
                System.out.println("Duração: " + cursoAux.getTempo() + " meses");
                System.out.println("Quantidade de Alunos: " + cursoAux.getQuantidade_alunos());
                System.out.println("--------------------------------");

                cursos.add(cursoAux);
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

    public boolean insertCurso(Curso curso) {
        connectToDB();
        String sql = "INSERT INTO cursos (id,nome, Descricao, Quantidade_alunos, Tempo) VALUES (?, ?, ?, ?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, curso.getNome());
            pst.setString(2, curso.getDescricao());
            pst.setInt(3, curso.getQuantidade_alunos());
            pst.setInt(4, curso.getTempo());
            pst.execute();
            sucesso = true;
        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
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
}
