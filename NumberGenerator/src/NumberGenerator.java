import java.util.*;

public class NumberGenerator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int J1 = in.nextInt();
        int J2 = in.nextInt();
        HashMap<Integer, Integer> mapA = new HashMap<>();
        int count = 0;

        while(J1 != 0 && J2 != 0) {
            count = 0;
            for (int i = 0; i < J1; i++) {
                mapA.put(i, in.nextInt());
            }

            for (int i = 0; i < J2; i++) {
                if (mapA.containsValue(in.nextInt())) {
                    mapA.remove(i);
                    count++;
                }
            }
            System.out.println(count);
            J1 = in.nextInt();
            J2 = in.nextInt();


        }
    }
}
