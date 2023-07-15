import java.util.ArrayList;

public class MisplacingBox extends Box{
    
    private ArrayList<Item> misPlace;

    public MisplacingBox() {
        this.misPlace = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        this.misPlace.add(item);
    }

    @Override
    public boolean isInBox(Item item){
        return false;
    }

}
