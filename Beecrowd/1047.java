import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int starth = sc.nextInt();
        int startm = sc.nextInt();
        int endh = sc.nextInt();
        int endm = sc.nextInt();
        int starttotal = starth * 60 + startm;
        int endtotal = endh * 60 + endm;
        int hours;
        int minutes;
        int duration = (endtotal - starttotal + 1440) % 1440;

        if (duration == 0) {
            duration = 1440;
        }

        hours = duration/60;
        minutes = duration % 60;

        System.out.println("O JOGO DUROU " + hours + " HORA(S) E " + minutes + " MINUTO(S)");
    }
}
