
public class Main {

    public static void main(String[] args) {
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Justin"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));
    }
}
