import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x;

        for (int i = 0; i < n; i++){
            x = sc.nextInt();
            if(x == 0){
                System.out.println("NULL");
            } else if ((x % 2) == 0) {
                System.out.print("EVEN ");
                if (x > 0){
                    System.out.println("POSITIVE");
                }else{
                    System.out.println("NEGATIVE");
                }
            }else {
                System.out.print("ODD ");
                if (x > 0){
                    System.out.println("POSITIVE");
                }else {
                    System.out.println("NEGATIVE");
                }
            }
        }
    }
}
