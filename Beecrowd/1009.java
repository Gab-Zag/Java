import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       String nome;
       double sal;
       double ven;
       double total;

       Scanner len = new Scanner(System.in);

       nome = len.nextLine();
       sal = len.nextDouble();
       ven = len.nextDouble();
       total = sal + (ven * 0.15);
       String totalform = String.format("%.2f", total);

        System.out.println("TOTAL = R$ " + totalform);
    }
}
