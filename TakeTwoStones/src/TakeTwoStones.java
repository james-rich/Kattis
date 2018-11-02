import java.util.Scanner;

public class TakeTwoStones {
        public static void main(String[] args) {
            Scanner scanneer = new Scanner(System.in);
            if(scanneer.hasNext()){
                int tmp = Integer.parseInt(scanneer.nextLine()) % 2;
                if (tmp == 1) {
                    System.out.println("Alice");
                }else{
                    System.out.println("Bob");
                }
            }
        }
}
