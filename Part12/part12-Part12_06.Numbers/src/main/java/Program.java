
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int count = 0;

        System.out.println("How many random numbers should be printed?");
        int times = Integer.valueOf(scanner.nextLine());

        while (count != times) {
            count++;
            System.out.println(random.nextInt(11));
        }

    }
}
