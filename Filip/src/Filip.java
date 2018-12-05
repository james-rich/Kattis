import java.util.Scanner;

public class Filip {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String x = String.valueOf(in.nextInt());
        String y = String.valueOf(in.nextInt());

        StringBuilder xInt = new StringBuilder();
        StringBuilder yInt = new StringBuilder();

        for (int i = x.length() ; i > 0; i--) {
            xInt.append(x.charAt(i-1));
        }
        for (int i = y.length(); i > 0; i--) {
            yInt.append(y.charAt(i-1));
        }

        if(Integer.valueOf(xInt.toString()) > Integer.valueOf(yInt.toString())){
            System.out.print(xInt);
        }else{
            System.out.print(yInt);
        }
    }
}
