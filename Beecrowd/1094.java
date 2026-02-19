import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aux = sc.nextInt();
        int x;
        double total = 0;
        int c = 0;
        int r = 0;
        int s = 0;
        double pc = 0;
        double pr = 0;
        double ps = 0;
        String race;

        for (int i = 0; i < aux; i++){
            x = sc.nextInt();
            total += x;
            race = sc.next();
            switch (race){
                case "C":
                    c += x;
                    break;
                case "R":
                    r += x;
                    break;
                case "S":
                    s += x;
                    break;
            }
        }

        pc = (c/total) * 100.0;
        pr = (r/total) * 100.0;
        ps = (s/total) * 100.0;

        System.out.printf("Total: %.0f cobaias%n", total);
        System.out.printf("Total de coelhos: %d%n", c);
        System.out.printf("Total de ratos: %d%n", r);
        System.out.printf("Total de sapos: %d%n", s);
        System.out.printf("Percentual de coelhos: %.2f %%%n", pc);
        System.out.printf("Percentual de ratos: %.2f %%%n", pr);
        System.out.printf("Percentual de sapos: %.2f %%%n", ps);
    }
}
