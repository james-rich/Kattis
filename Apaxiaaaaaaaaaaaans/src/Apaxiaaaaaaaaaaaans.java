import java.util.Scanner;

public class Apaxiaaaaaaaaaaaans {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String line = in.nextLine();
        Character c = line.charAt(0);
        System.out.print(c);
        for (int i = 1; i < line.length(); i++) {
            if(!c.equals(line.charAt(i))){
                System.out.print(line.charAt(i));
                c = line.charAt(i);
            }
        }
    }
}
