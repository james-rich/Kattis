import
        java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        for (int i = 1; i <= z; i++) {
            if(i % y == 0 && i % x == 0){
                System.out.println("FizzBuzz");
            }else if(i % x == 0 ){
                System.out.println("Fizz");
            }else if(i % y == 0 ){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
