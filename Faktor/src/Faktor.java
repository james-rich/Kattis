import java.util.Scanner;

public class Faktor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");
        System.out.println((Integer.parseInt(numbers[0]) * (Integer.parseInt(numbers[1]) - 1))+1);
    }
}

