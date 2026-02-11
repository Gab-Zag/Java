import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        int m = 0 ;
        int h = 0;

        n = sc.nextInt();

        while (n >= 60){
            n -= 60;
            m++;
            if(m >= 60){
                m = 0;
                h++;
            }
        }
        System.out.println(h + ":" + m + ":" + n);
    }
}
