import java.util.Scanner;

public class Zamka {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int min = Integer.valueOf(in.nextLine());
        int max = Integer.valueOf(in.nextLine());
        int sum = Integer.valueOf(in.nextLine());


        for (int i = min; i <= max; i++) {
            int tmp = i;
            int length = String.valueOf(tmp).length();
            int total = 0;
            for (int j = 0; j < length; j++) {
                total += tmp % 10;
                tmp = tmp / 10;
            }
            if (total == sum) {
                System.out.println(i);
                break;
            }
        }

        for (int i = max; i >= min; i--) {
            int tmp = i;
            int length = String.valueOf(tmp).length();
            int total = 0;
            for (int j = 0; j < length; j++) {
                total += tmp % 10;
                tmp = tmp / 10;
            }
            if (total == sum) {
                System.out.println(i);
                break;
            }
        }
        
    }
}
