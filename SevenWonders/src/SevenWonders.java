import java.util.Scanner;

public class SevenWonders {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String len = scanner.nextLine();
        int t = 0;
        int c = 0;
        int g = 0;
        Character cT = 'T';
        Character cC = 'C';
        Character cG = 'G';
        for(int i = 0; i < len.length(); i++){
            Character character = len.charAt(i);
            if(character.equals(cT)){
                t += 1;
            }else if(character.equals(cC)){
                c += 1;
            }else if(character.equals(cG)) {
                g += 1;
            }
        }
        int multiply = 0;
        if(t > c){
            if(c > g){
                multiply = g *7;
            }else{
                multiply = c * 7;
            }
        }else if(g > c){
            if(c > t){
                multiply = t *7;
            }else{
                multiply = c * 7;
            }
        }else{
            if(t > g){
                multiply = g * 7;
            }else{
                multiply = t * 7;
            }
        }
        int res = (int) (Math.pow(t, 2) + Math.pow(c, 2) + Math.pow(g, 2)) + multiply;
        System.out.println(res);
    }

}