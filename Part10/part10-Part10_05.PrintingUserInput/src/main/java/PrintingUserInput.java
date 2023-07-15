
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while (true) {
            String row = scanner.nextLine();
            if (row.isEmpty()) {
                break;
            }

            list.add(row);
        }

        String output = list.stream()
        .reduce("", (PrintingUserInput, Input) -> PrintingUserInput + Input +"\n");
        System.out.println(output);
    }

}
