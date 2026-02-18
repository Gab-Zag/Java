import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double perimetro;
        double area;
        if((a+b) > c && (a+c) > b && (b+c) > a){
            perimetro = a+b+c;
            System.out.printf("Perimetro = %.1f\n", perimetro);
        }else{
            area = ((a+b) * c) /2;
            System.out.printf("Area = %.1f\n", area);
        }
    }
}
