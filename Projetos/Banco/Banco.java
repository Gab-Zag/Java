import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
    ArrayList<Cliente> clientes = new ArrayList<>();

    public void adicionarCliente(Cliente clien){
        clientes.add(clien);
    }

    public void Depositar(){
        Scanner sc = new Scanner(System.in);
        double valor;
    }
}
