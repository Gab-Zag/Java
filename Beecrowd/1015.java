import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x1;
        double x2;
        double y1;
        double y2;
        double result;

        Scanner len = new Scanner(System.in);

        x1 = len.nextDouble();
        y1 = len.nextDouble();
        x2 = len.nextDouble();
        y2 = len.nextDouble();

        result = Math.sqrt((Math.pow(x2 - x1,2) + Math.pow(y2 - y1, 2)));

        String resform = String.format("%.4f", result);
        System.out.println(resform);
    }
}
