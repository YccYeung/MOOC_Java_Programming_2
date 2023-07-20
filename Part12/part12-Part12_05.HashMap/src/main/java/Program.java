
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // You can test the class here
        HashMap<String, String> hashmap = new HashMap<>();

        hashmap.add("Testing1", "123");
        hashmap.print();
        hashmap.remove("2");
        System.out.println("----------");
        hashmap.add("Testing2", "222");
        hashmap.print();

    }

}
