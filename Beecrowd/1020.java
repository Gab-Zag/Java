import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int d;
        int m = 0 ;
        int a = 0;

        d = sc.nextInt();

        while(d >= 365){
            a++;
            d-= 365;
        }
        while (d >= 30){
            m++;
            d-=30;
        }
        System.out.println(a + " ano(s)\n" + m + " mes(es)\n" + d + " dia(s)");
    }
}
