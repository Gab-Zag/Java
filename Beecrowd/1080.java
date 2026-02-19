import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        int aux = 1;
        int largest = -9999;
        int position = 0;

        while (aux != 101){
            x = sc.nextInt();
            if (x > largest){
                largest = x;
                position = aux;
            }
            aux++;
        }

        System.out.printf("%d%n%d%n", largest, position);
    }
}
