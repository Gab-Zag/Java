import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;
        int seg = 0;
        int min = 0;
        int h = 0;

        Scanner len = new Scanner(System.in);

        x = len.nextInt();

        while (x >= 3600){
            h++;
            x = x - 3600;
        }

        while (x >= 60){
            min++;
            x = x - 60;
        }

        while (x > 0 ){
            seg++;
            x--;
        }

        System.out.println(h + ":" + min + ":" + seg);
    }
}
