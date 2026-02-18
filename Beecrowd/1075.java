import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int aux = 0;

        aux = n;
        n = 0;

        while (n != 10000){
            if((n % aux) == 2){
                System.out.println(n);
            }
            n++;
        }
    }
}
