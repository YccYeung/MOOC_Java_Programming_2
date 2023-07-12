
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> positive = new ArrayList<>();
        int sum = 0;
        double average = 0.0;
        

        while (true) {

            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            if (number > 0) {
                positive.add(number);
            }

        }

        for (int i : positive) {
            sum += i; 
        }

        if (sum == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            average = (double) sum / positive.size();
            System.out.println(average);
        }
    }
}
