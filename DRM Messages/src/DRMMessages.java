import java.util.Scanner;

public class DRMMessages {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String string = in.nextLine();

        String one = string.substring(0, string.length() / 2);
        String two = string.substring(string.length() / 2);
        int oneTotal = 0;
        int twoTotal = 0;
        for (int i = 0; i < one.length(); i++) {
            oneTotal += (int) (one.charAt(i));
            twoTotal += (int) (two.charAt(i));
        }

        int newOne;
        int newTwo;
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < one.length(); i++) {
            newOne = ((one.charAt(i) - 65) + oneTotal) % 26;
            newTwo = ((two.charAt(i) - 65) + twoTotal) % 26;
            res.append((char) (((newOne + newTwo) % 26) + 65));
        }

        System.out.println(res);
    }
}
