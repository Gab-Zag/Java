import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int maior = 0;
        int menor = 0;
        int soma = 0;

       if (x > y){
            maior = x;
            menor = y;
       }else {
            menor = x;
            maior = y;
       }

        for (int i = menor + 1; i < maior; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        System.out.println(soma);
    }
}
