import java.util.ArrayList;
import java.util.Scanner;

public class Sibice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");
        int count = Integer.parseInt(numbers[0]);
        ArrayList<String> results = new ArrayList<>();
        int maxLen = (int) Math.sqrt(Math.pow(Integer.parseInt(numbers[1]), 2) + Math.pow(Integer.parseInt(numbers[2]),2));
        for(int i = 0; i < count; i++){
            if(scanner.nextInt() <= maxLen){
                results.add("DA");
            }else{
                results.add("NE");
            }
        }
        for(String r : results){
            System.out.println(r);
        }
    }
}
