
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        while (true) {
            int row = Integer.valueOf(scanner.nextLine());
            if (row < 0) {
                break;
            }

            list.add(row);
        }

        list.stream().filter(value -> value >= 1 && value <= 5).forEach(i -> System.out.println(i));
    }
}
