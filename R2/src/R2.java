import java.util.Scanner;

public class R2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String len = scanner.nextLine();
            String[] numbers = len.split(" ");
            System.out.println(Integer.parseInt(numbers[1]) * 2 - Integer.parseInt(numbers[0]));
        }
    }