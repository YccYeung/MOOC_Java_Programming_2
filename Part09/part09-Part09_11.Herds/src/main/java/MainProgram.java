

public class MainProgram {

    public static void main(String[] args) {
        //you can test the program here
        Herd herd = new Herd();
        herd.addToHerd(new Organism(57, 66));
        herd.move(1, 1);
        System.out.println(herd);
    }
}
