import java.util.Scanner;

public class Main {
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        Academia academia = new Academia();
        System.out.println("Qual o nome da sua academia: ");
        String lugar = sc.nextLine();
        System.out.println("Qual o numero de telefone para contato: ");
        String telefone = sc.nextLine();
        System.out.println("Bem vindo a Academia " + lugar);
        System.out.println("Para Qualquer duvida nosso numero e " + telefone);

        while (true){
            System.out.println("===Menu===");
            System.out.println("1. Adicionar Equipamento");
            System.out.println("2. Mostrar Informações da Academia");
            System.out.println("3. Mostrar Equipamentos em Manutenção");
            System.out.println("4. Mostrar Equipamento com Maior Custo");
            System.out.println("5. Mostrar Equipamento com Menor Custo");
            System.out.println("6. Sair");
            System.out.println("Escolha uma opção: ");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Nome do Equipamento: ");
                    String nomeEquipamento = sc.nextLine();
                    System.out.println("Custo de Aquisição: ");
                    double custoEquipamento = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Status (Funcionamento/Manutenção: ");
                    String statusEquipamento = sc.nextLine();
                    Equipamentos equip = new Equipamentos(nomeEquipamento,custoEquipamento,statusEquipamento);
                    academia.adicionarEquipamento(equip);
                    break;
                case 2:
                    academia.mostrarInformacoes();
                    break;
                case 3:
                    academia.mostrarEquipamentosEmMnutencao();
                    break;
                case 4:
                    academia.mostrarEquipamentosMaiorCusto();
                    break;
                case 5:
                    academia.mostrarEquipamentosMenorCusto();
                    break;
                case 6:
                    System.out.println("Saindo do Programa.");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida tente novamente.");
            }
        }
    }
}
