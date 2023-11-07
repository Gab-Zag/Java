public class AnoVeiculoException extends Exception{
    public AnoVeiculoException() {
        System.out.println("Não é permitido cadastrar veículos com ano de lançamento nulo, ou menor que 0");
    }
}
