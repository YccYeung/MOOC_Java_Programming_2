import java.util.ArrayList;

public class Box implements Packable{

    private double capacity;
    private ArrayList<Packable> box;
    private int count;
    
    public Box(double maximumCapacity) {
        this.capacity = maximumCapacity;
        this.box = new ArrayList<>();
    }

    public double weight() {
        double weight = 0;
        for (Packable packable : box) {
            weight += packable.weight();
        }
        return weight;
    }

    public int itemNumber() {
        return this.count;
    }

    public void add(Packable packable) {
        this.box.add(packable);
        this.count++;

        if (this.capacity < weight()) {
            this.box.remove(packable);
            this.count--;
        }
    }

    public String toString() {
        return "Box: " + itemNumber() + " items, total weight " + weight() + " kg";
    }

}
