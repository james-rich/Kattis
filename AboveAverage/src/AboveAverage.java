import java.util.Scanner;

public class AboveAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numLines = Integer.parseInt(scanner.next());
        for (int i = 0; i < numLines; i++) {
            int numPeople = scanner.nextInt();
            int[] grades = new int[numPeople];
            int total = 0;
            float average = 0;
            for (int j = 0; j < numPeople; j++) {
                grades[j] = scanner.nextInt();
                total += grades[j];
            }
            average = total / numPeople;
            int multiply = 0;
            for (int j = 0; j < numPeople; j++) {
                if (grades[j] > average){
                    multiply += 1;
                }
            }
            System.out.printf("%.3f", (float) 100 / numPeople * multiply);
            System.out.println("%");
        }
    }
}
