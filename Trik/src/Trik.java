import java.util.Scanner;

public class Trik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cup = 1;
        String len = scanner.nextLine();
        String[] chars = len.split("");
        for(int i = 0; i < len.length(); i++){
            if(chars[i].equals("A")){
                if(cup == 1){
                    cup = 2;
                }else if(cup ==2){
                    cup = 1;
                }else{
                    cup = 3;
                }
            }else if(chars[i].equals("B")){
                if(cup == 2){
                    cup = 3;
                }else if(cup ==3){
                    cup = 2;
                }else{
                    cup = 1;
                }
            }else{
                if(cup == 3){
                    cup = 1;
                }else if(cup ==1){
                    cup = 3;
                }else{
                    cup = 2;
                }
            }
        }
        System.out.println(cup);
    }
}
