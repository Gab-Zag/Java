import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;
        int ano = 0;
        int mes = 0;
        int dia = 0;

        Scanner len = new Scanner(System.in);

        x = len.nextInt();

        while (x >= 365){
            ano++;
            x = x - 365;
        }

        while (x >= 30){
            mes++;
            x = x - 30;
        }

        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(x + " dia(s)");
    }
}
