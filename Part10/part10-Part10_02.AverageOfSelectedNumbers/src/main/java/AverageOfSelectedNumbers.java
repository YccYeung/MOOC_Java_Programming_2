
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");

        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }

            list.add(row);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String choice = scanner.nextLine();
        if (choice.equals("n")) {
            double negative = list.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .filter(number -> number < 0)
            .average()
            .getAsDouble();

            System.out.println("Average of the negative numbers: " + negative);
        }

        if (choice.equals("p")) {
            double positive = list.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .filter(number -> number > 0)
            .average()
            .getAsDouble();

            System.out.println("Average of the positive numbers: " + positive);
        }
    }
}
