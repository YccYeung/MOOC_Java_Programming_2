import java.util.ArrayList;

public class Pipe<T> {

    private ArrayList<T> list;
    
    public Pipe() {
        this.list = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        this.list.add(value);
    }

    public T takeFromPipe() {
        if (this.list.size() == 0) {
            return null;
        }
        
        T remove = this.list.remove(0);
        return remove;

    }

    public boolean isInPipe() {
        return this.list.size() > 0;
    }

}
