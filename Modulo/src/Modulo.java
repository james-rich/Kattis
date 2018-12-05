import java.util.ArrayList;
import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> unique = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            int x = in.nextInt() % 42;
            if(!unique.contains(x)){
                unique.add(x);
            }
        }
        System.out.print(unique.size());
    }
}
