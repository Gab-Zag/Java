import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Double> x = new ArrayList<>();
        int n = sc.nextInt();
        double aux;
        double result;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < 3; j++){
                aux = sc.nextDouble();
                x.add(aux);
            }
            result = ((x.get(0) * 2) + (x.get(1) * 3) + (x.get(2) * 5)) / 10;
            System.out.printf("%.1f%n", result);
            x.clear();
        }
    }
}
