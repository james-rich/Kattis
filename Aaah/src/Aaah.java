import java.util.Scanner;

public class Aaah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();

        if(line1.length() >= line2.length()){
            System.out.println("go");
        }else{
            System.out.println("no");
        }
    }
}
