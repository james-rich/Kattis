import java.util.Scanner;

public class QualityAdjusted {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cases = in.nextInt();
        double res = 0;
        for (int i = 0; i < cases; i++) {
            double tmp = in.nextDouble();
            res += in.nextDouble() * tmp;
        }
        System.out.printf("%.3f", res);
    }
}
