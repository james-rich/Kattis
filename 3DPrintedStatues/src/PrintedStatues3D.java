import java.util.Scanner;

public class PrintedStatues3D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float line = scanner.nextFloat();
        int i = 1;
        while(line > 1.0){
            line = line / 2;
            i++;
        }
        System.out.println(i);
    }
}
