import java.util.Scanner;

public class Kemija {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();

        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if(Character.valueOf('a').equals(string.charAt(i)) ||Character.valueOf('e').equals(string.charAt(i)) || Character.valueOf('i').equals(string.charAt(i)) || Character.valueOf('o').equals(string.charAt(i)) || Character.valueOf('u').equals(string.charAt(i))){
                newString.append(string.charAt(i));
                i+=2;
            }else{
                newString.append(string.charAt(i));
            }
        }
        System.out.println(newString);
    }
}
