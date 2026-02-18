import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> odd = new ArrayList<>();
        int x = sc.nextInt();
        int oddnumber = 0;

        while (oddnumber != 6){
            if((x % 2) != 0){
                odd.add(x);
                oddnumber++;
            }
            x++;
        }

        for (int i = 0; i < oddnumber; i++){
            System.out.println(odd.get(i));
        }
    }
}
