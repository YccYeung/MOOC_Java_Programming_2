import java.util.ArrayList;

public class ChangeHistory {
    
    private ArrayList<Double> storage;

    public ChangeHistory() {
        this.storage = new ArrayList<>();
    }

    public void add(double status) {
        this.storage.add(status);
    }

    public void clear() {
        this.storage.clear();
    }

    public double maxValue() {

        if (this.storage.size() == 0) {
            return 0;
        }

        double largest = 0;
        for (double i : this.storage) {
            if (i > largest) {
                largest = i;
            }
        }

        return largest;
    }

    public double minValue() {

        if (this.storage.size() == 0) {
            return 0;
        }
        double smallest = this.storage.get(0);
        for (double i : this.storage) {
            if (i < smallest) {
                smallest = i;
            }
        }
        return smallest;
    }

    public double average() { 

        if (this.storage.size() == 0) {
            return 0;
        }

        double sum = 0;
        for (double i : this.storage) {
            sum += i;
        }

        double average = sum / this.storage.size();
        return average;
    }

    public String toString() {
        return this.storage.toString();
    }
}
