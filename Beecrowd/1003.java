import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        int result;

        Scanner len = new Scanner(System.in);
        
        a = len.nextInt();
        b = len.nextInt();
        result = a+b;

        System.out.println("SOMA = " + result);
    }
}
