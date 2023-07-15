
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> testing = new ArrayList<>(readBooks("Testing.txt"));
        for (Book i : testing) {
            System.out.println(i);
        }


    }

    public static List<Book> readBooks(String file) {
        List<Book> list = new ArrayList<>();
        try {
            Files.lines(Paths.get(file))
            .map(i -> i.split(","))
            .map(j -> new Book(j[0], Integer.valueOf(j[1]), Integer.valueOf(j[2]), j[3]))
            .forEach(k -> list.add(k));
        } catch (Exception e) {
            System.out.println("The error message is " + e.getMessage());
        }

        return list;
    }

}
