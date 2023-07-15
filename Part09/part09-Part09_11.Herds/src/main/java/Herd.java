import java.util.ArrayList;

public class Herd implements Movable{

    private ArrayList<Movable> herd;
    
    public Herd() {
        this.herd = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }

    public void move(int dx, int dy) {
        for (Movable i : herd) {
            i.move(dx, dy);
        }
    }

    public String toString(){

        String temp = "";
        for (Movable i : herd) {
            temp += i.toString() + "\n";
        }

        return temp;
    }
}
