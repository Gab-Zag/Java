import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();
        int i;
        int maior = -999;
        int medio = 0;
        int menor = 999;

        for (i = 0; i < 3; i++){
            numeros.add(sc.nextInt());
        }

        for (i = 0; i < 3; i++){
            if(numeros.get(i) > maior){
                maior = numeros.get(i);
            }
            if (numeros.get(i) < menor){
                menor = numeros.get(i);
            }
        }

        for (i=0; i<3; i++){
            if(numeros.get(i) > menor){
                if (numeros.get(i) < maior){
                    medio = numeros.get(i);
                }
            }
        }

        System.out.println(menor);
        System.out.println(medio);
        System.out.println(maior);
        System.out.println();
        for(i = 0; i<=2; i++){
            System.out.println(numeros.get(i));
        }
    }
}
