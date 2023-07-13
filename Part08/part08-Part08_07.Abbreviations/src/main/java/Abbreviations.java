import java.util.HashMap;
public class Abbreviations {

    private HashMap<String, String> dict;
    
    public Abbreviations() {
        this.dict = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        this.dict.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        return this.dict.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
       return this.dict.get(abbreviation);
    }
}

