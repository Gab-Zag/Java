import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String chose = sc.next();

        switch (chose){
            case "vertebrado":
                chose = sc.next();
                switch (chose){
                    case "ave":
                        chose = sc.next();
                        switch (chose){
                            case "carnivoro":
                                System.out.println("aguia");
                                break;
                            case "onivoro":
                                System.out.println("pomba");
                                break;
                        }
                        break;
                    case "mamifero":
                        chose = sc.next();
                        switch (chose){
                            case "onivoro":
                                System.out.println("homem");
                                break;
                            case "herbivoro":
                                System.out.println("vaca");
                                break;
                        }
                        break;
                }
                break;
            case "invertebrado":
                chose = sc.next();
                switch (chose){
                    case "inseto":
                        chose = sc.next();
                        switch (chose){
                            case "hematofago":
                                System.out.println("pulga");
                                break;
                            case "herbivoro":
                                System.out.println("lagarta");
                                break;
                        }
                        break;
                    case "anelideo":
                        chose = sc.next();
                        switch (chose){
                            case "hematofago":
                                System.out.println("sanguessuga");
                                break;
                            case "onivoro":
                                System.out.println("minhoca");
                                break;
                        }
                        break;
                }
                break;
        }
    }
}
