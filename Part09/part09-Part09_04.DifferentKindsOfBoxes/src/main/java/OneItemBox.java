import java.util.ArrayList;

public class OneItemBox extends Box{
    
    private ArrayList<Item> oneItemMax;

    public OneItemBox() {
        this.oneItemMax = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (this.oneItemMax.isEmpty()) {
            this.oneItemMax.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item){

        for (Item i : oneItemMax) {
            if (i.getName().equals(item.getName())) {
                return true;
            }
        }

            return false;
    }


}
