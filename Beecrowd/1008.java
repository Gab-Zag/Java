import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        int hor;
        double val;
        double sal;

        Scanner len = new Scanner(System.in);

        num = len.nextInt();
        hor = len.nextInt();
        val = len.nextDouble();

        sal = hor * val;
        String salfor = String.format("%.2f", sal);

        System.out.println("NUMBER = " + num);
        System.out.println("SALARY = U$ " + salfor);
    }
}
