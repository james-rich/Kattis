import java.util.Scanner;

public class StuckInATimeLoop {
    public static void main(String[] args) {
        Scanner scanneer = new Scanner(System.in);
        if(scanneer.hasNext()){
            int tmp = Integer.parseInt(scanneer.nextLine());
            for(int i = 1; i < tmp + 1; i++){
                System.out.println(i + " Abracadabra");
            }
        }
    }

}
