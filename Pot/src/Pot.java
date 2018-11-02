import java.util.ArrayList;
import java.util.Scanner;

public class Pot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();
        int len = scanner.nextInt();
        int res= 0;
        for(int i=0; i < len; i++){
            int tmp = scanner.nextInt();
            int pow = tmp % 10;
            res += Math.pow(tmp / 10, pow);
        }
        System.out.println(res);
    }

}
