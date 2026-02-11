import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int aux = 0;
        if(b > c){
            aux++;
        }
        if(d > a){
            aux++;
        }
        if((c+d) > (a+b)){
            aux++;
        }
        if( c > 0 && d >0){
            aux++;
        }
        if((a % 2) == 0){
            aux++;
        }
        if( aux == 5){
            System.out.println("Valores aceitos");
        }else{
            System.out.println("Valores nao aceitos");
        }
    }
}
