import java.util.ArrayList;
import java.util.Scanner;

public class Tarifa {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            ArrayList<String> input = new ArrayList<>();
            while(in.hasNextLine()) {
                input.add(in.nextLine());
            }

            int x = Integer.parseInt(input.get(0));
            int n = Integer.parseInt(input.get(1));
            int result = x * n + x;

            for (int i = 2; i < input.size();  i++) {
                result -= Integer.parseInt(input.get(i));
            }
            System.out.println(result);
        }
}
