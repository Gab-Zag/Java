import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double entrada = sc.nextDouble();
        int n = (int) Math.round(entrada * 100); // tudo em centavos

        int[] valores = {10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5, 1};
        int[] qtd = new int[12];

        for (int i = 0; i < valores.length; i++) {
            qtd[i] = n / valores[i];
            n = n % valores[i];
        }

        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100.00\n", qtd[0]);
        System.out.printf("%d nota(s) de R$ 50.00\n", qtd[1]);
        System.out.printf("%d nota(s) de R$ 20.00\n", qtd[2]);
        System.out.printf("%d nota(s) de R$ 10.00\n", qtd[3]);
        System.out.printf("%d nota(s) de R$ 5.00\n", qtd[4]);
        System.out.printf("%d nota(s) de R$ 2.00\n", qtd[5]);

        System.out.println("MOEDAS:");
        System.out.printf("%d moeda(s) de R$ 1.00\n", qtd[6]);
        System.out.printf("%d moeda(s) de R$ 0.50\n", qtd[7]);
        System.out.printf("%d moeda(s) de R$ 0.25\n", qtd[8]);
        System.out.printf("%d moeda(s) de R$ 0.10\n", qtd[9]);
        System.out.printf("%d moeda(s) de R$ 0.05\n", qtd[10]);
        System.out.printf("%d moeda(s) de R$ 0.01\n", qtd[11]);
    }
}
