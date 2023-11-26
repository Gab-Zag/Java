package org.example;

import org.example.DAO.CursoDAO;
import org.example.DAO.AlunoDAO;
import org.example.Model.*;
import org.example.DAO.GerenteDAO;
import org.example.DAO.ProfessorDAO;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        CursoDAO cursoDAO = new CursoDAO();
        AlunoDAO alunoDAO = new AlunoDAO();
        ProfessorDAO professorDAO = new ProfessorDAO();
        GerenteDAO gerenteDAO = new GerenteDAO();
        Scanner sc = new Scanner(System.in);
        String emailDigitado;
        String senhaDigitada;
        boolean flag = true;
        boolean flag1 = false;
        boolean flag2 = false;
        try {
            if(gerenteDAO.verificarRegistros()){
                //login Gerente
                System.out.println("--- Login Gerente ---");
                System.out.println("Digite seu email : ");
                emailDigitado = sc.nextLine();

                System.out.println("Digite sua senha: ");

                senhaDigitada = sc.nextLine();
                if(gerenteDAO.validarCredenciais(emailDigitado,senhaDigitada) != null){
                    while (flag){
                        System.out.println("--- MENU ---");
                        System.out.println("1 - Login Aluno");
                        System.out.println("2 - Registrar Aluno");
                        System.out.println("3 - Login Professor");
                        System.out.println("4 - Registrar Professor");
                        System.out.println("5 - Login Gerente");
                        System.out.println("6 - Sair do Programa");

                        int op = sc.nextInt();
                        switch (op) {
                            case 1:
                                //login Aluno
                                System.out.println("Digite seu email: ");
                                sc.nextLine();
                                emailDigitado = sc.nextLine();

                                System.out.println("Digite sua senha: ");

                                senhaDigitada = sc.nextLine();

                                // Verificar se as credenciais estão corretas
                                if (!(alunoDAO.validarCredenciais(emailDigitado, senhaDigitada) != null)) {
                                    System.out.println("Credenciais inválidas. Tente novamente.");
                                } else {
                                    System.out.println("Login bem-sucedido. Bem-vindo, " + alunoDAO.validarCredenciais(emailDigitado, senhaDigitada).getNome());
                                    flag1 = true;
                                    while (flag1) {
                                        System.out.println("--- MENU ---");
                                        System.out.println("1 - Se Inscrever em um Curso");
                                        System.out.println("2 - Ver Cursos Inscritos");
                                        System.out.println("3 - Editar Perfil");
                                        System.out.println("4 - Deletar Conta");
                                        System.out.println("5 - Sair");
                                        int ip = sc.nextInt();
                                        switch (ip) {
                                            case 1:
                                                //Increver em um Curso
                                                alunoDAO.validarCredenciais(emailDigitado, senhaDigitada).Inscrever();
                                                break;
                                            case 2:
                                                //Ver curso inscrito
                                                alunoDAO.validarCredenciais(emailDigitado, senhaDigitada).MostrarCursos();
                                                break;
                                            case 3:
                                                alunoDAO.validarCredenciais(emailDigitado, senhaDigitada).EditarPerfil();
                                                break;
                                            case 4:
                                                alunoDAO.deleterUser(emailDigitado);
                                                flag1 = false;
                                                break;
                                            case 5:
                                                flag1 = false;
                                                break;
                                            default:
                                                System.out.println("Entre com uma opção válida");
                                                break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                //Adicionando Novo Aluno
                                System.out.println("--- Adicionando Aluno ---");
                                System.out.print("Entre com o nome do Aluno: ");
                                sc.nextLine();
                                String nome = sc.nextLine();
                                //Entrando com o email do Aluno
                                System.out.print("Entre com o seu e-mail: ");
                                String email;
                                email = sc.nextLine();
                                //Entrando com o Telefone
                                System.out.print("Entre com seu Telefone: ");
                                int Telefone = sc.nextInt();
                                //Entrando com a senha
                                System.out.print("Crie uma senha: ");
                                sc.nextLine();
                                String Senha;
                                Senha = sc.nextLine();
                                //Adicionando o aluno
                                Aluno p1 = new Aluno(nome, email, Telefone, Senha);
                                p1.mostrarInfo();

                                boolean verificaEmail =  VerificarEmail.isEmailValid(p1.getEmail());

                                if(verificaEmail){
                                    System.out.println("Email valido");
                                    alunoDAO.insertUser(p1);
                                    System.out.println("Aluno adicionado com sucesso!");

                                }else{
                                    System.out.println("Email invalido");
                                    System.out.println("E-mail inválido! Tente denovo.");
                                }
                                break;
                            case 3:
                                //login Professor
                                System.out.println("Digite seu Email: ");
                                sc.nextLine();
                                emailDigitado = sc.nextLine();
                                System.out.println("Digite sua Senha: ");
                                senhaDigitada = sc.nextLine();

                                //verificar se as credenciais estão corretas
                                if(!(professorDAO.validarCredenciais(emailDigitado, senhaDigitada) != null)){
                                    System.out.println("Credencias invalidas. Tente Novamente");
                                }else{
                                    System.out.println("Login bem-sucedido. Bem-Vindo, " + professorDAO.validarCredenciais(emailDigitado,senhaDigitada).getNome());
                                    flag = false;
                                    flag1 = true;
                                    while (flag1){
                                        System.out.println("--- MENU ---");
                                        System.out.println("1 - Inscrever em um curso");
                                        System.out.println("2 - Mostrar curso cadastrado");
                                        System.out.println("3 - Deletar Conta");
                                        System.out.println("4 - Sair");

                                        int ip = sc.nextInt();
                                        switch (ip){
                                            case 1:
                                                professorDAO.validarCredenciais(emailDigitado, senhaDigitada).Inscrever();
                                                break;
                                            case 2:
                                                professorDAO.validarCredenciais(emailDigitado, senhaDigitada).MostrarCursos();
                                                break;
                                            case 3:
                                                professorDAO.deleterUser(emailDigitado);
                                                break;
                                            case 4:
                                                flag1 = false;
                                                break;
                                            default:
                                                System.out.println("Entre com uma opção válida");
                                                break;

                                        }
                                    }
                                }
                                break;
                            case 4:
                                //Adicionando Novo Professor
                                System.out.println("--- Adicionando Professor ---");
                                System.out.print("Entre com o nome do Professor: ");
                                sc.nextLine();
                                String nomep = sc.nextLine();
                                //Entrando com o email do Professor
                                System.out.print("Entre com o seu e-mail: ");
                                String emailp;
                                emailp = sc.nextLine();
                                //Entrando com o Telefone
                                System.out.print("Entre com seu Telefone: ");
                                int Telefonep = sc.nextInt();
                                //Entrando com a senha
                                System.out.print("Crie uma senha: ");
                                sc.nextLine();
                                String Senhap;
                                Senhap = sc.nextLine();
                                //Adicionando o professor
                                Professor p2 = new Professor(nomep, emailp, Telefonep, Senhap);
                                p2.mostrarInfo();

                                boolean verificaEmailp =  VerificarEmail.isEmailValid(p2.getEmail());

                                if(verificaEmailp){
                                    System.out.println("Email valido");
                                    professorDAO.insertUser(p2);
                                    System.out.println("Professor adicionado com sucesso!");

                                }else{
                                    System.out.println("Email invalido");
                                    System.out.println("E-mail inválido! Tente denovo.");
                                }
                                break;
                            case 5:
                                //login Gerente
                                System.out.println("Digite seu email: ");
                                sc.nextLine();
                                emailDigitado = sc.nextLine();

                                System.out.println("Digite sua senha: ");

                                senhaDigitada = sc.nextLine();

                                // Verificar se as credenciais estão corretas
                                if (!(gerenteDAO.validarCredenciais(emailDigitado, senhaDigitada) != null)) {
                                    System.out.println("Credenciais inválidas. Tente novamente.");
                                } else{
                                    System.out.println("Login bem-sucedido. Bem-vindo, " + gerenteDAO.validarCredenciais(emailDigitado, senhaDigitada).getNome());
                                    flag = false;
                                    flag1 = true;
                                    while (flag1) {
                                        System.out.println("--- MENU ---");
                                        System.out.println("1 - adicionar aluno");
                                        System.out.println("2 - Ver todos os alunos cadastrados");
                                        System.out.println("3 - Gerenciar conta de Aluno em questão");
                                        System.out.println("4 - Adicionar Curso");
                                        System.out.println("5 - Ver lista de Cursos");
                                        System.out.println("6 - Adicionar Professor:");
                                        System.out.println("7 - Ver lista de Professores");
                                        System.out.println("8 - Gerenciar conta de Professor em questão:");
                                        System.out.println("9 - Editar Perfil");
                                        System.out.println("10 - Deletar Conta");
                                        System.out.println("11 - Sair");
                                        int ip = sc.nextInt();
                                        switch (ip) {
                                            case 1:
                                                //Adicionando Novo Aluno
                                                System.out.println("--- Adicionando Aluno ---");
                                                System.out.print("Entre com o nome do Aluno: ");
                                                sc.nextLine();
                                                String nomeg3 = sc.nextLine();
                                                //Entrando com o email do Aluno
                                                System.out.print("Entre com o seu e-mail: ");
                                                String emailg3;
                                                emailg3 = sc.nextLine();
                                                //Entrando com o Telefone
                                                System.out.print("Entre com seu Telefone: ");
                                                int Telefoneg3 = sc.nextInt();
                                                //Entrando com a senha
                                                System.out.print("Crie uma senha: ");
                                                sc.nextLine();
                                                String Senhag3;
                                                Senhag3 = sc.nextLine();
                                                //Adicionando o aluno
                                                Aluno p5 = new Aluno(nomeg3, emailg3, Telefoneg3, Senhag3);
                                                p5.mostrarInfo();

                                                boolean verificaEmailg3 =  VerificarEmail.isEmailValid(p5.getEmail());

                                                if(verificaEmailg3){
                                                    System.out.println("Email valido");
                                                    alunoDAO.insertUser(p5);
                                                    System.out.println("Aluno adicionado com sucesso!");

                                                }else{
                                                    System.out.println("Email invalido");
                                                    System.out.println("E-mail inválido! Tente denovo.");

                                                }
                                                break;
                                            case 2:
                                                gerenteDAO.VerTodosOsAlunos();
                                                break;
                                            case 3:
                                                //login Aluno
                                                System.out.println("Digite seu email: ");
                                                sc.nextLine();
                                                emailDigitado = sc.nextLine();

                                                System.out.println("Digite sua senha: ");

                                                senhaDigitada = sc.nextLine();

                                                // Verificar se as credenciais estão corretas
                                                if (!(alunoDAO.validarCredenciais(emailDigitado, senhaDigitada) != null)) {
                                                    System.out.println("Credenciais inválidas. Tente novamente.");
                                                } else {

                                                    System.out.println("Login bem-sucedido. Bem-vindo, " + alunoDAO.validarCredenciais(emailDigitado, senhaDigitada).getNome());
                                                    boolean flag1g2;
                                                    flag1g2 = true;
                                                    while (flag1g2) {
                                                        System.out.println("--- MENU ---");
                                                        System.out.println("1 - Se Inscrever em um Curso");
                                                        System.out.println("2 - Ver Cursos Inscritos");
                                                        System.out.println("3 - Editar Perfil");
                                                        System.out.println("4 - Deletar Conta");
                                                        System.out.println("5 - Sair");

                                                        int ip3 = sc.nextInt();
                                                        switch (ip3) {
                                                            case 1:
                                                                alunoDAO.validarCredenciais(emailDigitado, senhaDigitada).Inscrever();
                                                                break;
                                                            case 2:
                                                                alunoDAO.validarCredenciais(emailDigitado, senhaDigitada).MostrarCursos();
                                                                break;
                                                            case 3:
                                                                alunoDAO.validarCredenciais(emailDigitado, senhaDigitada).EditarPerfil();
                                                                break;
                                                            case 4:
                                                                alunoDAO.deleterUser(emailDigitado);
                                                                break;
                                                            case 5:
                                                                flag1 = false;
                                                                break;
                                                            default:
                                                                System.out.println("Entre com uma opção válida");
                                                                break;
                                                        }
                                                    }
                                                }
                                                break;
                                            case 4:
                                                System.out.println("---Adicionar Curso---");
                                                System.out.println("Entre com o nome do Curso: ");
                                                sc.nextLine();
                                                String nomec = sc.nextLine();
                                                System.out.println("Entre com a Descrição: ");
                                                String descricao;
                                                descricao = sc.nextLine();
                                                System.out.println("Entre com a duração do curso em meses: ");
                                                int tempo = sc.nextInt();
                                                System.out.println("Entere com o id do cuso (lembrese id pode ser um valor numero de 1 - 100");
                                                int id = sc.nextInt();
                                                Curso c1 = new Curso(nomec,descricao,tempo,0, id);
                                                gerenteDAO.AdicionarCurso(c1);
                                                break;
                                            case 5:
                                                gerenteDAO.VerTodosOsCursos();
                                                break;
                                            case 6:
                                                //Adicionando Novo Professor
                                                System.out.println("--- Adicionando Professor ---");
                                                System.out.print("Entre com o nome do Professor: ");
                                                sc.nextLine();
                                                String nomep2 = sc.nextLine();
                                                //Entrando com o email do Professor
                                                System.out.print("Entre com o seu e-mail: ");
                                                String emailp2;
                                                emailp2 = sc.nextLine();
                                                //Entrando com o Telefone
                                                System.out.print("Entre com seu Telefone: ");
                                                int Telefonep2 = sc.nextInt();
                                                //Entrando com a senha
                                                System.out.print("Crie uma senha: ");
                                                sc.nextLine();
                                                String Senhap2;
                                                Senhap = sc.nextLine();
                                                //Adicionando o professor
                                                Professor p3 = new Professor(nomep2, emailp2, Telefonep2, Senhap);
                                                p3.mostrarInfo();

                                                boolean verificaEmailp2 =  VerificarEmail.isEmailValid(p3.getEmail());

                                                if(verificaEmailp2){
                                                    System.out.println("Email valido");
                                                    professorDAO.insertUser(p3);
                                                    System.out.println("Professor adicionado com sucesso!");

                                                }else{
                                                    System.out.println("Email invalido");
                                                    System.out.println("E-mail inválido! Tente denovo.");
                                                }
                                                break;
                                            case 7:
                                                gerenteDAO.VerTodosOsProfessores();
                                                break;
                                            case 8:
                                                //login Professor
                                                System.out.println("Digite seu Email: ");
                                                sc.nextLine();
                                                emailDigitado = sc.nextLine();
                                                System.out.println("Digite sua Senha: ");
                                                senhaDigitada = sc.nextLine();

                                                //verificar se as credenciais estão corretas
                                                if(!(professorDAO.validarCredenciais(emailDigitado, senhaDigitada) != null)){
                                                    System.out.println("Credencias invalidas. Tente Novamente");
                                                }else{
                                                    System.out.println("Login bem-sucedido. Bem-Vindo, " + professorDAO.validarCredenciais(emailDigitado,senhaDigitada).getNome());
                                                    boolean flag1g;
                                                    flag1g = true;
                                                    while (flag1g){
                                                        System.out.println("--- MENU ---");
                                                        System.out.println("1 - Deletar Conta");
                                                        System.out.println("2 - Sair");

                                                        int ip2 = sc.nextInt();
                                                        switch (ip2){
                                                            case 1:
                                                                professorDAO.deleterUser(emailDigitado);
                                                                break;
                                                            case 2:
                                                                flag1g = false;
                                                                break;
                                                            default:
                                                                System.out.println("Entre com uma opção válida");
                                                                break;

                                                        }
                                                    }
                                                }
                                                break;
                                            case 9:
                                                gerenteDAO.validarCredenciais(emailDigitado, senhaDigitada).EditarPerfil();
                                                break;
                                            case 10:
                                                gerenteDAO.deleterUser(emailDigitado);
                                                break;
                                            case 11:
                                                flag1 = false;
                                                break;
                                            default:
                                                System.out.println("Entre com uma opção válida");
                                                break;
                                        }
                                    }
                                }
                            case 6:
                                flag = false;
                                break;
                        }
                    }
                }
            }else{
                //Adicionando Novo Gerente
                System.out.println("--- Adicionando Gerente ---");
                System.out.print("Entre com o nome do Gerente: ");
                String nomeg = sc.nextLine();
                //Entrando com o email do Gerente
                System.out.print("Entre com o seu e-mail: ");
                String emailg;
                emailg = sc.nextLine();
                //Entrando com o Telefone
                System.out.print("Entre com seu Telefone: ");
                int Telefoneg = sc.nextInt();
                //Entrando com a senha
                System.out.print("Crie uma senha: ");
                sc.nextLine();
                String Senhag;
                Senhag = sc.nextLine();
                //Adicionando o Gerente
                Gerente p3 = new Gerente(nomeg, emailg, Telefoneg, Senhag);
                p3.mostrarInfo();
                boolean verificaEmailg =  VerificarEmail.isEmailValid(p3.getEmail());
                if(verificaEmailg){
                    System.out.println("Email valido");
                    GerenteDAO.insertUser(p3);
                    System.out.println("Gerente adicionado com sucesso!");

                }else{
                    System.out.println("Email invalido");
                    System.out.println("E-mail inválido! Tente denovo.");
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
