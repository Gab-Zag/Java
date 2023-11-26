package org.example.Model;

import org.example.DAO.AlunoDAO;
import org.example.DAO.ProfessorDAO;
import org.example.DAO.CursoDAO;
import org.example.Interfaces.AbaAlunos;

import java.util.Scanner;

public class Professor extends Usuario implements AbaAlunos{
    ProfessorDAO professorDAO = new ProfessorDAO();
    CursoDAO cursoDAO = new CursoDAO();
    Scanner sc = new Scanner(System.in);

    @Override
    public void mostrarInfo(){
        System.out.println("Professor: "+getNome());
        System.out.println("Email: "+getEmail());
    }

    public Professor(String Nome, String email, int telefone, String senha){
        super(Nome,email,telefone,senha);
    }

    @Override
    public String getCurso() {
        return null;
    }

    @Override
    public void MostrarCursos() {
        cursoDAO.selectCursos();
    }

    @Override
    public void Inscrever() {
        System.out.println("Coloque o numero do curso que voce quer se inscrever");
        int cursoId = sc.nextInt();
        boolean inscricaoBemSucedida = professorDAO.inscreverProfessorEmCurso(cursoId, getEmail());
        // Verificar se a inscrição foi bem-sucedida
        if (inscricaoBemSucedida) {
            System.out.println("Professor inscrito com sucesso no curso!");
        } else {
            System.out.println("Falha na inscrição.");


        }
    }

    @Override
    public void EditarPerfil() {

    }
}
