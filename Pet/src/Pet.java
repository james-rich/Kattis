import java.util.Scanner;

public class Pet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nmax = 0;
        int win = 0;
        for(int i = 1; i <= 5; i++) {
            String len = scanner.nextLine();
            String[] numbers = len.split(" ");
            int tmp = Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]) + Integer.parseInt(numbers[2]) + Integer.parseInt(numbers[3]);
            if(tmp > nmax){
                nmax = tmp;
                win = i;
            }
        }
        System.out.println(win + " " + nmax);
    }
}