
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> bookList = new ArrayList<>();

        while (true) {
            System.out.println("Input the name of the book, empty stops: ");
            String bookName = scanner.nextLine();

            if (bookName.isEmpty()) {
                break;
            }

            System.out.println("Input the age recommendation: ");
            int recommendationAge = Integer.valueOf(scanner.nextLine());

            bookList.add(new Book(bookName, recommendationAge));
        }

        //Sorting
        Comparator<Book> comparator = Comparator.comparing(Book::Age).thenComparing(Book::bookName);
        Collections.sort(bookList, comparator);

        System.out.println(bookList.size() + " books in total.");
        System.out.println("Books:");

        for (Book i : bookList) {
            System.out.println(i.bookName() + " (recommended for " + i.Age() + " year-olds or older)");
        }
    }

   
}
