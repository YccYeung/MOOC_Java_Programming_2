import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card>{
    
    SortBySuit sortBySuit = new SortBySuit();

    public int compare(Card c1, Card c2) {
        return c1.getValue() - c2.getValue() + (sortBySuit.compare(c1, c2));
    }
}
