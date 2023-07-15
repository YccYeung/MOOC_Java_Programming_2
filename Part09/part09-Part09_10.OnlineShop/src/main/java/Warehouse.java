import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> warehouse;
    private Map<String, Integer> stockBlance;

    public Warehouse() {
        this.warehouse = new HashMap<>();
        this.stockBlance = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.warehouse.put(product, price);
        this.stockBlance.put(product, stock);
    }

    public int price(String product) {
        if (this.warehouse.containsKey(product)) {
            return this.warehouse.get(product);
        }

        return -99;
    }

    public int stock(String product) {
        if (this.stockBlance.containsKey(product)) {
            return this.stockBlance.get(product);
        }

        return 0;
    }

    public boolean take(String product) {

        if (stock(product) == 0) {
            return false;
        }
        
        int stock = this.stockBlance.get(product);

        if (stock - 1 >= 0) {
            this.stockBlance.replace(product, stock, stock - 1);
            return true;
        }

        return false;
    }

    public Set<String> products() {
        Set<String> product = new HashSet<>();
        for (String i: this.warehouse.keySet()) {
            product.add(i);
        }

        return product;
    }

}
