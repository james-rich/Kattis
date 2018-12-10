import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cases = in.nextInt();
        int time = in.nextInt();
        int curTime = 0;
        int count = 0;
        while(count != cases && curTime < time){
            curTime += in.nextInt();
            if(curTime > time){
                break;
            }
            count++;
        }
        System.out.println(count);

    }
}
