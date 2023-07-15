import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Item> shoppingCart;
    //private Item item;
    
    public ShoppingCart() {
        this.shoppingCart = new HashMap<>();
    }

    public void add(String product, int price) {

        if (this.shoppingCart.containsKey(product)) {
            this.shoppingCart.get(product).increaseQuantity();
        } else {
            this.shoppingCart.put(product, new Item(product, 1, price));
        }
    }

    public int price() {
        int sum = 0;
        for (Item i : this.shoppingCart.values()) {
            sum += i.price();
        }

        return sum;
    }

    public void print() {
        for (Item i : this.shoppingCart.values()) {
            System.out.println(i);
        }
    }   


}
