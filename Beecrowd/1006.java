import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double media;

        Scanner len = new Scanner(System.in);

        a = len.nextDouble();
        b = len.nextDouble();
        c = len.nextDouble();

        media = ((a * 2) + (b * 3) + (c * 5)) / 10;

        String mediaform = String.format("%.1f", media);

        System.out.println("MEDIA = " + mediaform);
    }
}
