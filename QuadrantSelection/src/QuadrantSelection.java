import java.util.Scanner;

public class QuadrantSelection {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        if (scanner.hasNext()) {
            int tmp1 = scanner.nextInt();
            int tmp2 = scanner.nextInt();
            if (tmp1 > 0 && tmp2 > 0) {
                System.out.println(1);
            } else if (tmp1 > 0 && tmp2 < 0){
                System.out.println(4);
            } else if(tmp1 < 0 && tmp2 > 0){
                System.out.println(2);
            }else{
                System.out.println(3);
            }
        }
    }

}