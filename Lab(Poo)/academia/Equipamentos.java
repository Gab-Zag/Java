public class Equipamentos {
    String nome;
    double custoAquisicao;
    String status;

    public Equipamentos(String nome, double custoAquisicao, String status){
        this.nome = nome;
        this.custoAquisicao = custoAquisicao;
        this.status = status;
    }
    public String getNome(){
        return nome;
    }

    public double getCustoAquisicao(){
        return custoAquisicao;
    }

    public String getStatus(){
        return status;
    }
}
