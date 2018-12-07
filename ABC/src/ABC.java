import java.util.Scanner;

public class ABC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
        String tmp = "";
        if(Integer.parseInt(numbers[1]) > Integer.parseInt(numbers[2])){
            tmp = numbers[2];
            numbers[2] = numbers[1];
            numbers[1] = tmp;
        }
        if(Integer.parseInt(numbers[0]) > Integer.parseInt(numbers[1])){
            tmp = numbers[1];
            numbers[1] = numbers[0];
            numbers[0] = tmp;
        }
        if(Integer.parseInt(numbers[1]) > Integer.parseInt(numbers[2])){
            tmp = numbers[2];
            numbers[2] = numbers[1];
            numbers[1] = tmp;
        }

        String[] line = null;
        if(scanner.hasNextLine()) {
            line = scanner.nextLine().split("");
        }

        if(line[0].equals("A")){
            System.out.print(numbers[0]);
            System.out.print(" ");
        }
        if(line[0].equals("B")){
            System.out.print(numbers[1]);
            System.out.print(" ");
        }
        if(line[0].equals("C")){
            System.out.print(numbers[2]);
            System.out.print(" ");
        }
        if(line[1].equals("A")){
            System.out.print(numbers[0]);
            System.out.print(" ");
        }
        if(line[1].equals("B")){
            System.out.print(numbers[1]);
            System.out.print(" ");
        }
        if(line[1].equals("C")){
            System.out.print(numbers[2]);
            System.out.print(" ");
        }
        if(line[2].equals("A")){
            System.out.print(numbers[0]);
            System.out.print(" ");
        }
        if(line[2].equals("B")){
            System.out.print(numbers[1]);
            System.out.print(" ");
        }
        if(line[2].equals("C")){
            System.out.print(numbers[2]);
            System.out.print(" ");
        }
    }
}
