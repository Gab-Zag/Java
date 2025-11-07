import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int raio;
        double result;
        Scanner len = new Scanner(System.in);

        raio = len.nextInt();
        result = (4/3.0) * 3.14159 * Math.pow(raio,3);

        String resultform = String.format("%.3f", result);
        System.out.println("VOLUME = " + resultform);
    }
}
