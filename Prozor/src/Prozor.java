
import java.util.Scanner;

public class Prozor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
        String[][] grid = new String[Integer.parseInt(numbers[0])][Integer.parseInt(numbers[1])];

        int racketX= 0;
        int racketY= 0;
        int racketSize = Integer.parseInt(numbers[2]) - 2;

        for (int i = 0; i < Integer.parseInt(numbers[0]); i++) {
            if(scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split("");
                grid[i] = line;
            }
        }

        int counter = 0;
        int highest = 0;

        for (int i = 1; i < grid.length-racketSize; i++) {
            for (int j = 1; j < grid[i].length-racketSize; j++) {
                for (int k = i; k < i+racketSize; k++) {
                    for (int l = j; l < j+racketSize; l++) {
                        if (grid[k][l].equals("*")) {
                            counter++;
                        }
                    }
                }
                if(counter > highest){
                    highest = counter;
                    racketX = i;
                    racketY = j;
                }
                counter = 0;
            }
        }

        System.out.println(highest);

        grid[racketX-1][racketY-1] = "+";
        grid[racketX+racketSize][racketY-1] = "+";
        grid[racketX-1][racketY+racketSize] = "+";
        grid[racketX+racketSize][racketY+racketSize] = "+";
        for (int k = racketY; k < racketY+racketSize; k++) {
            grid[racketX-1][k] = "-";
            grid[racketX+racketSize][k] = "-";
        }
        for (int k = racketX; k < racketX+racketSize; k++) {
            grid[k][racketY+racketSize] = "|";
            grid[k][racketY-1] = "|";
        }


        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }
}
