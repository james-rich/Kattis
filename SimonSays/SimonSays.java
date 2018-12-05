import java.util.Scanner;


public class SimonSays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int Lines = Integer.valueOf(in.nextLine());
        String sArr;
        for (int i = 0; i < Lines; i++) {
            sArr = in.nextLine();
            if(sArr.contains("Simon says")){
                for (int j = 11; j < sArr.length(); j++) {
                    System.out.print(sArr.charAt(j));
                }
                System.out.println();
            }
        }
    }
}
