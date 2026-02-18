import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Double> numbers = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            numbers.add(sc.nextDouble());
        }

        Collections.sort(numbers, Collections.reverseOrder());

        double A = numbers.get(0);
        double B = numbers.get(1);
        double C = numbers.get(2);

        double A2 = Math.pow(A, 2);
        double B2 = Math.pow(B, 2);
        double C2 = Math.pow(C, 2);

        double eps = 0.000001;

        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
            return;
        }

        if (Math.abs(A2 - (B2 + C2)) < eps) {
            System.out.println("TRIANGULO RETANGULO");
        } else if (A2 > B2 + C2) {
            System.out.println("TRIANGULO OBTUSANGULO");
        } else {
            System.out.println("TRIANGULO ACUTANGULO");
        }

        if (Math.abs(A - B) < eps && Math.abs(A - C) < eps) {
            System.out.println("TRIANGULO EQUILATERO");
        } else if (Math.abs(A - B) < eps || Math.abs(A - C) < eps || Math.abs(B - C) < eps) {
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
}
