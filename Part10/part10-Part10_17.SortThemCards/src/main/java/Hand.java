import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Hand implements Comparable<Hand>{
    
    private List<Card> poker;

    public Hand() {
        this.poker = new ArrayList<>();
    }

    public void add(Card card){
        this.poker.add(card);
    }

    public void print() {
        Iterator<Card> iterator = this.poker.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void sort() {
        Collections.sort(this.poker);
    }

    public int totalValue() {
        int sum = 0;
        for (Card card : this.poker) {
            sum += card.getValue();
        }

        return sum;
    }

    @Override
    public int compareTo(Hand hand) {
        return this.totalValue() - hand.totalValue();
    }

    public void sortBySuit() {
        sort();
        Collections.sort(poker, new SortBySuit());
    }
}
