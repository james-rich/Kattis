import java.util.Scanner;

public class SpeedLimit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int lines = in.nextInt();
            if(lines == -1){
                break;
            }
            int res = 0;
            int lastH = 0;
            for (int i = 0; i <lines; i++) {
                int speed = in.nextInt();
                int h = in.nextInt();
                res += speed * (h - lastH);
                lastH = h;
            }
            System.out.println(res + " miles");
        }
    }
}
