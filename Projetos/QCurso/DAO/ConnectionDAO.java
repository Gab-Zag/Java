package org.example.DAO;

import java.sql.*;

public abstract class ConnectionDAO {

    static Connection con; //conexão
    static PreparedStatement pst; // declaração(query) preparada - código em sql
    Statement st; //declaração(query) - código em sql
    ResultSet rs; //resposta do banco

    static String database = "QCurso";//nome do BD
    static String user = "root";
    static String password = "root";
    static String url = "jdbc:mysql://localhost:3306/" + database + "?useTimezone=true&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";



    public static void connectToDB() {
        try {
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Conexao deu certo!");
        } catch(SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
        }
    }
}
