public class List<Type> {

    private Type[] values;
    private int index;
    
    public List() {
        this.values = (Type[]) new Object[10];
        this.index = 0;
    }

    public void add(Type element) {
        this.values[this.index] = element;
        this.index++;

        if (this.values.length == this.index) {
            grow();
        }
    }

    private void grow() {
        int newSize = this.values.length + this.values.length/2;
        Type[] newValues = (Type[]) new Object[newSize];
        for (int i = 0; i < newValues.length; i++) {
            newValues[i] = this.values[i];
        }

        this.values = newValues;
    }

    public boolean contains(Type value) {
        for (int i = 0; i < this.index; i++) {
            if (this.values[i].equals(value)) {
                return true;
            }
        }

        return false;
    }

    public void remove(Type value) {
       int tempIndex = indexOfValue(value);
       if (tempIndex < 0) {
        return;
       }
       moveToTheLeft(tempIndex);
       this.index--;
    }

    public int indexOfValue(Type value) {
        for (int i = 0; i < this.index; i++) {
            if (this.values[i].equals(value)) {
                return i;
            }
        }

        return -1;
    }

    private void moveToTheLeft(int fromIndex) { 
        for (int i = fromIndex; i < this.index - 1; i++) {
            this.values[i] = this.values[i + 1]; 
        }
    }

    public Type value(int index){
        if (index < 0 || index > this.index) {
            throw new ArrayIndexOutOfBoundsException();
        }

        return this.values[index];
    }

    public int size() {
        return this.index;
    }
}
