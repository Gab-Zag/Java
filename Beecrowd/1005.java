import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a;
        double b;
        double media;

        Scanner len = new Scanner(System.in);

        a = len.nextDouble();
        b = len.nextDouble();

        media = ((a * 3.5) + (b * 7.5)) / 11;

        String mediaform = String.format("%.5f", media);

        System.out.println("MEDIA = " + mediaform);
    }
}
