import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int cod;
       int num;
       double val;
       double tot = 0;
       Scanner len = new Scanner(System.in);

       for(int i = 0; i < 2; i++) {
           cod = len.nextInt();
           num = len.nextInt();
           val = len.nextDouble();
           tot = tot + (num * val);
       }

       String totform = String.format("%.2f", tot);
        System.out.println("VALOR A PAGAR: R$ " + totform);
    }
}
