import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int temp;
        int vel;
        double valor;
        Scanner len = new Scanner(System.in);

        temp = len.nextInt();
        vel = len.nextInt();
        valor = (temp * vel) / 12.0;

        String valform = String.format("%.3f", valor);
        System.out.println(valform);
    }
}
