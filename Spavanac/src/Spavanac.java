import java.util.Scanner;

public class Spavanac {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int h = in.nextInt();
        int m = in.nextInt();

        if(m > 45){
            m -= 45;
        }else{
            if(h == 0){
                h = 24;
            }
            m += 60 - 45;
            h -= 1;

        }
        System.out.println(h + " " + m);
    }
}
