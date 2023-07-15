
public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Item)) {
            return false;
        }

        Item item = (Item) compared;

        if (this.name.equals(item.name)) {
            return true;
        }

        return false;
    }

    public int hashCode() {

        int hash = 7;

        hash = 7 * this.name.length() + 7;

        return hash;
    }

}
