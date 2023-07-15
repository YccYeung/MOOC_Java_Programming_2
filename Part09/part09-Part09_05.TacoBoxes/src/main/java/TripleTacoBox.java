public class TripleTacoBox implements TacoBox{

    private int taco;

    public TripleTacoBox() {
        this.taco = 3;
    }
    
    public int tacosRemaining() {
        return this.taco;
    }

    public void eat() {
        if (this.taco > 0) {
            this.taco -= 1;
        }
    }
}
