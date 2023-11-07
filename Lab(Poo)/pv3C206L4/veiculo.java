public class Veiculo implements Comparable<Veiculo> {
    // Atributos do veículo
    private String modelo;
    private String marca;
    private int ano;



    // Reescrita do método de comparação
    @Override
    public int compareTo(Veiculo veic) {
        // Comparação com tipos númericos
        // Double.compare(valor1,valor2)
        // Comparação com tipos literarais
        //this.modelo.compareTo(veic.modelo)
        return Integer.compare(this.ano,veic.ano);
    }
    // Getters para veículo


    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
