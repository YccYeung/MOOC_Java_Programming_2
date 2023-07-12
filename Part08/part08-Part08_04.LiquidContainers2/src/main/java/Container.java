public class Container {

    private int volume;
    
    public Container() {
        
    }

    public int contains() {
        return this.volume;
    }

    public void add(int amount) {
        if (amount >= 0 && amount <= 100) {
            this.volume += amount;
        } 

        if (amount > 100 || this.volume > 100) {
            this.volume = 100;
        }
    }

    public void remove(int amount) {
        if (this.volume < amount) {
            amount = this.volume;
        }
            this.volume -= amount;

    }

    public String toString() {
        return this.contains() + "/100";
    }
}
