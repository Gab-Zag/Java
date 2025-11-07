import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;
        int dif;

        Scanner len = new Scanner(System.in);

        a = len.nextInt();
        b = len.nextInt();
        c = len.nextInt();
        d = len.nextInt();

        dif = a * b - c * d;

        System.out.println("DIFERENCA = " + dif);
    }
}
