import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int maiorab = 0;
        int maior= 0;

        Scanner len = new Scanner(System.in);

        a = len.nextInt();
        b = len.nextInt();
        c = len.nextInt();

        maiorab = (a + b + Math.abs(a - b)) /2;
        maior = (maiorab + c + Math.abs(maiorab - c)) / 2;

        System.out.println(maior + " eh o maior");
    }
}
