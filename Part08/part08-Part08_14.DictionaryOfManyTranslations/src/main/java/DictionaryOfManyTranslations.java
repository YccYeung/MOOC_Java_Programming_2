import java.util.HashMap;
import java.util.ArrayList;
public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> dict;

    public DictionaryOfManyTranslations() {
        this.dict = new HashMap<>();
    }

    public void add(String word, String translation) {
        this.dict.putIfAbsent(word, new ArrayList<>());
        ArrayList<String> list = this.dict.get(word);
        list.add(translation);
    }

    public ArrayList<String> translate(String word) {
        ArrayList<String> list = new ArrayList<>();
        if (dict.containsKey(word)) {
            return dict.get(word);
        }
            return list;
    }

    public void remove(String word) {
        dict.remove(word);
    }


}
