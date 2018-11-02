import java.util.Scanner;

public class Autori {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split("");
        String res = "";
        for(String c : line){
            if(!(c.toLowerCase()).equals(c)){
                res += c;
            }
        }
        System.out.println(res);
    }
}
