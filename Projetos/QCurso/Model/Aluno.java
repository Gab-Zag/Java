package org.example.Model;

import org.example.DAO.AlunoDAO;
import org.example.DAO.CursoDAO;
import org.example.Interfaces.AbaAlunos;

import java.sql.SQLException;

import java.util.Scanner;

public class Aluno extends Usuario implements AbaAlunos {
    AlunoDAO alunoDAO= new AlunoDAO();
    CursoDAO cursoDAO = new CursoDAO();
    Scanner sc =  new Scanner (System.in);
    public Aluno(String Nome,String email,int telefone,String senha) {
        super(Nome,email,telefone,senha);
    }

    @Override
    public String getCurso() {
        return null;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Aluno: "+getNome());
        System.out.println("E-mail: "+getEmail());
    }

    @Override
    public void MostrarCursos() {
        cursoDAO.selectCursos();
    }

    @Override
    public void Inscrever() {
        System.out.println("Coloque o numero do curso que voce quer se inscrever");
        int cursoId = sc.nextInt();
        boolean inscricaoBemSucedida = alunoDAO.inscreverAlunoEmCurso(cursoId, getEmail());

        // Verificar se a inscrição foi bem-sucedida
        if (inscricaoBemSucedida) {
            System.out.println("Aluno inscrito com sucesso no curso!");
        } else {
            System.out.println("Falha na inscrição.");


        }
    }

    @Override
    public void EditarPerfil() {
        boolean flagteste=true;
        System.out.println("--- Editar ---");
        System.out.println("1 - Nome");
        System.out.println("2 - Email");
        System.out.println("3 - Telefone");
        System.out.println("4 - Senha");
        System.out.println("5 - Sair");
        int op = sc.nextInt();
        while(flagteste)
            switch (op) {
            case 1:
                String Novonome=sc.nextLine();
                alunoDAO.updateEmployeeName(this.getEmail(), Novonome);
                break;
                case 2:
                String Novoemail=sc.nextLine();
                alunoDAO.updateEmployeeEmail(this.getEmail(), Novoemail);
                break;
            case 3:
                String NovoTelefone=sc.nextLine();
                alunoDAO.updateEmployeeTelefone(this.getEmail(), NovoTelefone);
                break;
            case 4:
                String novaSenha=sc.nextLine();
                alunoDAO.updateEmployeeSenha(this.getEmail(), novaSenha);
                break;
            case 5:
                flagteste = false;
                break;
            default:
                System.out.println("Entre com uma opção válida");
                break;
        }
    }
}
