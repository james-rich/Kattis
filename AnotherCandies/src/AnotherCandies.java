import java.util.Scanner;

public class AnotherCandies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numCases = scanner.nextInt();
        for (int i = 0; i < numCases; i++) {
            int children = scanner.nextInt();
            double[] candy = new double[children];
            double total = 0;
            for (int j = 0; j < children; j++) {
                candy[j] = scanner.nextDouble();
                total += candy[j];
            }
            System.out.println(total / children);
            System.out.println(total / children);
            if (total % children == 0) {
                    System.out.println("YES");
            }else{
                    System.out.println("NO");

            }
        }
    }
}
