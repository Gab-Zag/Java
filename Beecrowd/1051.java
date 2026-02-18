import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double wage = sc.nextDouble();
        double tax = 0.00;

        if(wage > 4500.00){
            tax += (wage - 4500.00) * 0.28;
            wage = 4500.00;
        }

        if(wage > 3000.00){
            tax += (wage - 3000.00) * 0.18;
            wage = 3000.00;
        }

        if(wage > 2000.00){
            tax += (wage - 2000.00) * 0.08;
        }

        if (tax == 0.00){
            System.out.println("Isento");
        }else {
            System.out.printf("R$ %.2f%n",tax);
        }
    }
}
