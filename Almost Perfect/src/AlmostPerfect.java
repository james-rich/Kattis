import java.util.Scanner;

public class AlmostPerfect {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextLong()) {
            long inNum = in.nextLong();
            long num = 0;
            if(inNum % 2 == 0){
                num = inNum / 2 + 1;
            }else{
                num = (inNum - 1) / 2 + 1;
            }
            long res = 0;
            long tmp = 0;
            for (int i = 1; i < num; i++) {
                tmp = inNum % i;
                if (tmp == 0) {
                    res += i;
                }
                if(tmp > inNum){
                    break;
                }
            }
            if (res == inNum) {
                System.out.println(inNum + " perfect");
            } else if (res - 1 == inNum || res - 2 == inNum || res + 1 == inNum || res + 2 == inNum) {
                System.out.println(inNum + " almost perfect");
            } else {
                System.out.println(inNum + " not perfect");
            }
        }
    }
}
