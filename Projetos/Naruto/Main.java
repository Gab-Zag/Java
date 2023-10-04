import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Ninja> aldeia = new ArrayList<>();

        Gennin naruto = new Gennin("Naruto", 16, 100, 5, "Kakashi");
        Chunnin sasuke = new Chunnin("Sasuke", 17, 120, 15);
        Jonnin kakashi = new Jonnin("Kakashi", 35, 200, 45, "Clones");

        aldeia.add(naruto);
        aldeia.add(sasuke);
        aldeia.add(kakashi);

        for (Ninja ninja : aldeia) {
            ninja.treinarParaExame();
            ninja.treinarJutsu();
            ninja.realizarMissao();
            ninja.classificar();
            ninja.atacar();
            ninja.lutar();
            ninja.mostrarInfos();
            System.out.println();
        }

        System.out.println("Quantidade de ninjas na aldeia: " + Ninja.getNumTotalNinjas());
    }
}
