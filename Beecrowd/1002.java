import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double raio;
        double area;

        Scanner len = new Scanner(System.in);

        raio = len.nextDouble();

        area = 3.14159 * Math.pow(raio, 2);

        String areaformat = String.format("%.4f", area);
        System.out.println("A=" + areaformat);
    }
}
