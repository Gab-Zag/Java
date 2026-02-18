import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = 1;
        double r = 0;

        for (int i=1; i <= n; i++){
            if((x % 2) == 0){
                r = Math.pow(x, 2);
                System.out.printf("%d^2 = %.0f%n",x, r);
            }
            x++;
        }
    }
}
