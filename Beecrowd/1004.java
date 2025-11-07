import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        int prod;

        Scanner len = new Scanner(System.in);

        a = len.nextInt();
        b = len.nextInt();
        prod = a*b;

        System.out.println("PROD = " + prod);
    }
}
