import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x;
        int in = 0;
        int out = 0;

        for (int i=0; i < n; i++){
            x = sc.nextInt();

            if(x >= 10 && x <= 20){
                in++;
            }else {
                out++;
            }
        }

        System.out.printf("%d in%n%d out%n", in,out);
    }
}
