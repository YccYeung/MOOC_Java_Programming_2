public class CustomTacoBox implements TacoBox{
    
    private int taco;

    public CustomTacoBox(int taco) {
        this.taco = taco;
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
