import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double money = sc.nextDouble();
        double percentage = 0;
        double win;
        double newmoney;

        if(money <= 400){
            percentage = 15;
        }else if(money >= 400.01 && money <= 800.0){
            percentage = 12;
        }else if(money >= 800.01 && money <= 1200.00){
            percentage = 10;
        }else if(money >= 1200.01 && money <= 2000.00){
            percentage = 7;
        }else if(money > 2000.00){
            percentage = 4;
        }

        win = money * (percentage / 100 );
        newmoney = money + win;

        System.out.printf("Novo salario: %.2f\n", newmoney);
        System.out.printf("Reajuste ganho: %.2f\n", win);
        System.out.print("Em percentual: ");
        System.out.printf("%.0f", percentage);
        System.out.println(" %");
    }
}
