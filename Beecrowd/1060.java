import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = 1;
        int pairs = 0;

        for (int i = 0; i < 6; i++){
            n = sc.nextDouble();
            if (n > 0.00){
                pairs++;
            }
        }
        System.out.printf("%d valores positivos%n", pairs);
    }
}
