import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String b[] = Integer.toBinaryString(in.nextInt()).split("");
        int bLen = b.length;
        String res[] = new String[bLen];
        for (int j = 0; j < bLen; j++) {
            res[j] = b[bLen - (j + 1)];
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < res.length; i++) {
            result.append(res[i]);
        }

        System.out.println(Integer.parseInt(String.valueOf(result), 2));
    }
}
