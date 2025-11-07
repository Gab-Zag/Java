import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km;
        double l;
        double result;

        Scanner len = new Scanner(System.in);

        km = len.nextInt();
        l = len.nextDouble();

        result = km/l;
        String resform = String.format("%.3f", result);

        System.out.println(resform + " km/l");
    }
}
