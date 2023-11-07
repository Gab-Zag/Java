import java.io.*;
import java.util.ArrayList;

public class Arquivo {
    public void escreverArquivo(Veiculo veiculo){
        // Importando as classes que nos permitirão escrever no Arquivo
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;


        try {
            // Recebe o nome do meu arquivo
            os = new FileOutputStream("Veiculos.txt",true); // Arquivo

            // Mostra em qual arquivo estaremos escrevendo
            osw = new OutputStreamWriter(os);

            // Permite que escrevamos no arquivo
            bw = new BufferedWriter(osw);

            // Efetivamente escrevendo no arquivo
            bw.write("++ VEICULO ++\n"); // Flag
            bw.write(veiculo.getMarca()+"\n");
            bw.write(veiculo.getModelo()+"\n");
            bw.write(veiculo.getAno()+"\n");



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public ArrayList<Veiculo> lerArquivos(){
        // Criando array list que armazena os veículos encontrados no arquivo
        ArrayList<Veiculo> encontreiNoArquivo = new ArrayList<>();

        // Estruturas que servirão para a leitura dos dados
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        String linhaLer; // Auxiliar que servirá como ponteiro para ler o arquivo

        try{
            is = new FileInputStream("Veiculos.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);


            // Posiciando o cursor no inicio do Arquivo
            linhaLer = br.readLine();

            // Verificando e rodando o código enquanto tiver informações no txt
            while(linhaLer!=null){
                // Verificando se já estamos na estrutura de um funcionário
                if(linhaLer.contains("++ VEICULO ++")){


                    // Criando um objeto auxiliar de Veículo
                    Veiculo auxVeiculo= new Veiculo();
                    auxVeiculo.setMarca(br.readLine());
                    auxVeiculo.setModelo(br.readLine());
                    auxVeiculo.setAno(Integer.parseInt(br.readLine()));

                    // Adicionando o funcionário ao arrayList, para informar que encontrei o veículo
                    encontreiNoArquivo.add(auxVeiculo);
                }
                // Passando para a próxima linha
                linhaLer = br.readLine();
            }
        }catch (Exception e){

        }
        return encontreiNoArquivo;
    }

}
