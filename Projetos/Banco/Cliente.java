import java.util.Scanner;
public class Cliente {
    Scanner sc = new Scanner(System.in);
    private String nome;
    private int id;

    private double Saldo;

    double valor;

    public Cliente(String nome, int id, double Saldo) {
        this.nome = nome;
        this.id = id;
        this.Saldo = Saldo;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public void depositar(){
        System.out.println("Quanto gostaria de depositar: ");
        valor = sc.nextDouble();
        if(valor > 0){
            Saldo += valor;
            System.out.println("Deposito de " + valor + " realizada com sucesso.");
        }else{
            System.out.println("Valor de deposito inválido.");
        }
    }

    public void Trasferir(){
        System.out.println("Seu saldo e de " + getSaldo() + " Reais");
        System.out.println("Quanto gostaria de Tranferir: ");
        valor = sc.nextDouble();//entrada de dados
        if (valor > 0 && valor <= Saldo){
            System.out.println("Você gostaria de confimar essa tranzação: ");
            System.out.println("1. Sim | 2. Não");
            int tras = sc.nextInt();//escolha do usuario de confirmação
            switch (tras) {
                //para concluir a transação
                case 1:
                    Saldo -= valor;
                    System.out.println("A transferencia de " + valor + " foi realzida com sucesso.");
                    break;
                //para negar a transação
                case 2:
                    System.out.println("Transação cancelada com sucesso!");
                    break;
            }
        }else
        {
            System.out.println("Saldo Insuficiente.");
        }
    }

    public void Extrato(){
        System.out.println("Seu extrato e de " + getSaldo() + " Reais");
    }
    public double getSaldo(){
        return Saldo;
    }
}
