import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();
        double ne;
        double m;
        double mf;

        m = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;
        m = Math.floor(m * 10) / 10;

        System.out.printf("Media: %.1f\n", m);
        if(m >=7.0){
            System.out.println("Aluno aprovado.");
        }else if (m >= 5.0 && m < 7.0){
            System.out.println("Aluno em exame.");
            ne = sc.nextDouble();
            System.out.printf("Nota do exame: %.1f\n", ne);
            mf = (m + ne)/2;
            mf = Math.floor(mf * 10) / 10;
            if(mf >= 5.0){
                System.out.println("Aluno aprovado.");
            }else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n",mf);
        }else{
            System.out.println("Aluno reprovado.");
        }
    }
}
