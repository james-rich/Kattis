import java.util.Scanner;

public class RoamingRomans {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float tmp = (float) (((scanner.nextFloat() * 1000) * 5280/4854) + 0.5);
        System.out.println((int)tmp);
    }
}