import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double delta;
        double x1;
        double x2;
        
        delta = Math.pow(b,2) - (4 * a * c);
        
        if (delta <= 0){
            System.out.println("Impossivel calcular");
        } else if ((2*a) == 0) {
            System.out.println("Impossivel calcular");
        } else if (Math.sqrt(delta) <= 0) {
            System.out.println("Impossivel calcular");
        }else{
            x1 = (-b + Math.sqrt(delta)) / (2*a);
            x2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.printf("R1 = %.5f\nR2 = %.5f\n", x1, x2);
        }
    }
}
