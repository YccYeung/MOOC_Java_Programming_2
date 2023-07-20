import java.util.ArrayList;
import java.util.List;

public class HashMap<K, V> {
    
    private List<Pair<K, V>> hashmap;
    //private int index;

    public HashMap() {
        this.hashmap = new ArrayList<>();
    }

    public V get(K key) {
        int index = 0;
        for (int i = 0; i < this.hashmap.size(); i++) {
            if (this.hashmap.get(i).getKey().equals(key)) {
                index = i;
            }
        }

        return this.hashmap.get(index).getValue();
    }

    public void add(K key, V value) {
        Pair<K, V> pair = new Pair<K,V>(key, value);
        this.hashmap.add(pair);
    }

    public void remove(K key) {
        
        for (int i = 0; i < this.hashmap.size(); i++) {
            if (this.hashmap.get(i).getKey().equals(key)) {
                 this.hashmap.remove(i);
            }
        }

        if (this.hashmap.size() == 0) {
            return;
        }
    }

    public int size() {
        return this.hashmap.size();
    }

    public void print() {
        for (int i = 0; i < this.hashmap.size(); i++) {
            K keys = this.hashmap.get(i).getKey();
            V values = this.hashmap.get(i).getValue();
            System.out.println(keys + ":" + values);
        }
    }
}
