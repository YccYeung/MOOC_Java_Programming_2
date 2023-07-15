import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{
    
    private int capacity;
    private ArrayList<Item> itemList;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.itemList = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (this.capacity >= item.getWeight()) {
            itemList.add(item);
            this.capacity -= item.getWeight();
        }
    }

    @Override
    public boolean isInBox(Item item) {

        for (Item i : itemList) {
            if (i.getName().equals(item.getName())) {
                return true;
            }
        }

        return false;
    }

}
