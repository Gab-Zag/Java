import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //entradada de dados
        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco();
        Hud hud = new Hud();
        int id = 0;//numero de contas
        double Saldo = 0;//Saldo
        double valor;
        boolean tela1 = true;// boleano para a primeira tela do codigo
        //Inicio do Aplicativo
        while (tela1) {
            Hud.PrimeiroMenu();//Chamando a primeira tela do programa
            int opcao = sc.nextInt();//escolha do usuario
            sc.nextLine();
            //resposta do aplicativo para a escolha
            switch (opcao) {
                //caso seja novo usuario
                case 1:
                    System.out.print("Nome: ");//entrada do nome do usuario
                    String nome = sc.nextLine();
                    id++;//criando o valor de id dele
                    Cliente cliente = new Cliente(nome, id, Saldo);//criando o cliente no sistema
                    banco.adicionarCliente(cliente);
                    boolean tela2 = true;//booleado para a segunda tela do aplicativo caso o usuario seja novo
                    System.out.println("Olá " + cliente.getNome());//recepção do aplicativo
                    //tela padrão do aplicativo para todos os usuarios
                    while (tela2) {
                        Hud.Segunda_tela_do_banco();//chamando a segunda tela do aplicativo
                        int opcao2 = sc.nextInt();//escolha do usuario de transações no aplicativo
                        switch (opcao2) {
                            //caso um para depositar o valor no aplicativo
                            case 1:
                                cliente.depositar();
                                break;
                            //caso dois para Transferir para outra conta
                            case 2:
                                cliente.Trasferir();
                                // caso 3 para ver o extrato do banco
                            case 3:
                                cliente.Extrato();
                                break;
                            //caso 4 para voltar a tela inicial
                            case 4:
                                tela2 = false;
                                break;
                        }
                    }
                    break;
                //caso ja tenha conta criada
                case 2:
                    break;
                //fechar o aplicativo
                case 3:
                    tela1 = false;
                    break;
            }
        }
    }
}
