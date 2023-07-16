
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        List<Literature> list = new ArrayList<>();
        try {
            Files.lines(Paths.get("literacy.csv"))
            .map(s -> s.split(","))
            .forEach(i -> list.add(new Literature(i[2], i[3], Integer.valueOf(i[4]), Double.valueOf(i[5]))));

        } catch (Exception e) {
            System.out.println("The error message is " + e.getMessage());
        }

        list.stream()
        .sorted()
        .forEach(i -> System.out.println(i));

    }
}
