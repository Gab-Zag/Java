import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;
        int cem = 0;
        int cinquenta = 0;
        int vinte = 0;
        int dez = 0;
        int cinco = 0;
        int dois = 0;
        int um = 0;

        Scanner len = new Scanner(System.in);

        x = len.nextInt();

        System.out.println(x);

        while (x >= 100){
            cem++;
            x = x - 100;
        }

        while (x >= 50){
            cinquenta++;
            x = x - 50;
        }

        while (x >= 20){
            vinte++;
            x = x - 20;
        }

        while (x >= 10){
            dez++;
            x = x - 10;
        }

        while (x >= 5){
            cinco++;
            x = x - 5;
        }

        while (x >= 2){
            dois++;
            x = x - 2;
        }

        while (x >= 1){
            um++;
            x--;
        }

        System.out.println(cem + " nota(s) de R$ 100,00");
        System.out.println(cinquenta + " nota(s) de R$ 50,00");
        System.out.println(vinte + " nota(s) de R$ 20,00");
        System.out.println(dez + " nota(s) de R$ 10,00");
        System.out.println(cinco + " nota(s) de R$ 5,00");
        System.out.println(dois + " nota(s) de R$ 2,00");
        System.out.println(um + " nota(s) de R$ 1,00");
    }
}
