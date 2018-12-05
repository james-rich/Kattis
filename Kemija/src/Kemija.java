import java.util.ArrayList;
import java.util.Scanner;

public class Kemija {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();

        StringBuilder newString = new StringBuilder();
        boolean wasVowel = false;
        for (int i = 0; i < string.length(); i++) {
            if("a".equals(string.charAt(i)) || "e".equals(string.charAt(i)) || "i".equals(string.charAt(i)) || "o".equals(string.charAt(i)) || "u".equals(string.charAt(i))){
                wasVowel = true;
                newString.append(string.charAt(i));
                i+=2;
            }
        }
        System.out.println(newString);
    }
}
