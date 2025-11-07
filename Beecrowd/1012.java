import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double tri;
        double cir;
        double tra;
        double qua;
        double ret;

        Scanner len = new Scanner(System.in);

        a = len.nextDouble();
        b = len.nextDouble();
        c = len.nextDouble();

        tri = (a*c)/2;
        cir = 3.14159 * Math.pow(c,2);
        tra = ((a + b) * c) / 2;
        qua = Math.pow(b,2);
        ret = a * b;

        String triform = String.format("%.3f",tri);
        String cirform = String.format("%.3f", cir);
        String traform = String.format("%.3f", tra);
        String quaform = String.format("%.3f", qua);
        String retform = String.format("%.3f", ret);

        System.out.println("TRIANGULO: " + triform);
        System.out.println("CIRCULO: " + cirform);
        System.out.println("TRAPEZIO: " + traform);
        System.out.println("QUADRADO: " + quaform);
        System.out.println("RETANGULO: " + retform);
    }
}
