import java.util.ArrayList;
public class TodoList {

    private ArrayList<String> toDoList;
    
    public TodoList() {
        this.toDoList = new ArrayList<>();
    }

    public void add(String task) {
        this.toDoList.add(task);
    }

    public void print() {
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println(i+1 + ": " + toDoList.get(i));
        }
    }

    public void remove(int number) {
        toDoList.remove(number - 1);
    }
}
