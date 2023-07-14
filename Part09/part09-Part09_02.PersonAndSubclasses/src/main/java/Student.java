public class Student extends Person{

    private int credit;

    public Student(String name, String street) {
        super(name, street);
        this.credit = 0;
    }

    public void study() {
        this.credit += 1;
    }

    public int credits() {
        return this.credit;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Study credits " + this.credits();
    }

}
