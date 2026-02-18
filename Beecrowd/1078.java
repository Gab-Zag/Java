import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r;

        for (int i = 1; i <= 10; i++){
            r = i * n;
            System.out.printf("%d x %d = %d%n",i,n,r);
        }
    }
}
