import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Criando um objeto de Arquivo
        Arquivo arq = new Arquivo();
        // Criando uma estrutura para entrada de dados
        Scanner sc = new Scanner(System.in);
        // Controladora do menu
        boolean executando = true;
        // Criando um objeto de Veiculo
        Veiculo veiculo = new Veiculo();


        while(executando){
            // Menu de informações
            System.out.println("+++ BEM VINDO AO MENU DE CADASTRO DE VEÍCULOS +++");
            System.out.println("1 - Cadastrar Veículos");
            System.out.println("2 - Listar Veículos");
            System.out.println("3 - Listar Veículos em ordem crescente de ano");
            System.out.println("4 - Listar Veículos em ordem decrescente de ano");
            System.out.println("5 - Sair");
            int op = sc.nextInt();
            sc.nextLine();
            ArrayList<Veiculo> veiculos = arq.lerArquivos();
            // Menu
            switch (op){
                case 1:
                    // Coletando as informações do funcionário
                    System.out.println("Marca: ");
                    veiculo.setMarca(sc.nextLine());
                    System.out.println("Modelo: ");
                    veiculo.setModelo(sc.nextLine());


                    try {
                        System.out.println("Ano: ");
                        veiculo.setAno(sc.nextInt());
                        if(veiculo.getAno()<=0) {
                            throw new AnoVeiculoException();
                        }

                    }catch (Exception e ){
                        break; // Parando a execução de salvar os valores

                    }
                    // Escrevendo o veículo no arquivo
                    arq.escreverArquivo(veiculo);
                    break;
                case 2:
                    // Executar o método de leitura
                    System.out.println("INFORMAÇÕES DOS VEÍCULOS");
                    for (int i = 0; i < veiculos.size(); i++) {
                        System.out.println("MARCA: "+veiculos.get(i).getMarca());
                        System.out.println("MODELO: "+veiculos.get(i).getModelo());
                        System.out.println("ANO: "+veiculos.get(i).getAno());
                    }
                    break;
                case 3:
                    // Executar o método de leitura
                    // Ordenando em ordem crescente de ano
                    Collections.sort(veiculos);
                    System.out.println("INFORMAÇÕES DOS VEÍCULOS");
                    for (int i = 0; i < veiculos.size(); i++) {
                        System.out.println("MARCA: " + veiculos.get(i).getMarca());
                        System.out.println("MODELO: " + veiculos.get(i).getModelo());
                        System.out.println("ANO: " + veiculos.get(i).getAno());
                    }
                    break;
                case 4:
                    // Executar o método de leitura
                    // Ordenando em ordem crescente de ano
                    Collections.sort(veiculos);
                    // Ordenando em ordem decrescente
                    Collections.reverse(veiculos);
                    System.out.println("INFORMAÇÕES DOS VEÍCULOS");
                    for (int i = 0; i < veiculos.size(); i++) {
                        System.out.println("MARCA: " + veiculos.get(i).getMarca());
                        System.out.println("MODELO: " + veiculos.get(i).getModelo());
                        System.out.println("ANO: " + veiculos.get(i).getAno());
                    }

                    break;
                case 5:
                    // Sair do menu
                    executando=false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }


        }




    }

}
