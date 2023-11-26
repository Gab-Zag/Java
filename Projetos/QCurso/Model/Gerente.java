package org.example.Model;

import org.example.DAO.CursoDAO;
import org.example.DAO.GerenteDAO;
import org.example.Interfaces.AbaAlunos;

import java.util.Scanner;

public class Gerente extends Usuario implements AbaAlunos {

    GerenteDAO gerenteDAO = new GerenteDAO();

    Scanner sc = new Scanner(System.in);

    public Gerente(String Nome, String email, int Telefone, String senha){
        super(Nome,email,Telefone,senha);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Gerente: "+getNome());
        System.out.println("E-mail: "+getEmail());
    }

    @Override
    public String getCurso() {
        return null;
    }

    @Override
    public void MostrarCursos() {
    }

    @Override
    public void Inscrever() {

    }

    @Override
    public void EditarPerfil() {
        Boolean flag=true;
        System.out.println("--- Editar ---");
        System.out.println("1 - Nome");
        System.out.println("2 - Email");
        System.out.println("3 - Telefone");
        System.out.println("4 - Senha");
        System.out.println("5 - Sair");
        int op = sc.nextInt();
        while(flag)
            switch (op) {
                case 1:
                    String Novonome=sc.nextLine();
                    gerenteDAO.updateEmployeeName(this.getEmail(), Novonome);
                    break;
                case 2:
                    String Novoemail=sc.nextLine();
                    gerenteDAO.updateEmployeeEmail(this.getEmail(), Novoemail);
                    break;
                case 3:
                    String NovoTelefone=sc.nextLine();
                    gerenteDAO.updateEmployeeTelefone(this.getEmail(), NovoTelefone);
                    break;
                case 4:
                    String novaSenha=sc.nextLine();
                    gerenteDAO.updateEmployeeSenha(this.getEmail(), novaSenha);
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Entre com uma opção válida");
                    break;
            }
    }
}
