
public class MainProgram {

    public static void main(String[] args) {
        // test your classes here
        Person person1 = new Person("Justin", Education.BA);
        Person person2 = new Person("Yeung", Education.HS);
        Person person3 = new Person("James", Education.MA);
        Employees employees1 = new Employees();
        employees1.add(person1);
        employees1.add(person2);
        employees1.add(person3);
        employees1.print(Education.BA);
        employees1.fire(Education.HS);
        employees1.print();
    }
}
