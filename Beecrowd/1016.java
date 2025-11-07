import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km;
        int min;
        Scanner len = new Scanner(System.in);

        km = len.nextInt();

        min = km * 2;

        System.out.println(min + " minutos");
    }
}
