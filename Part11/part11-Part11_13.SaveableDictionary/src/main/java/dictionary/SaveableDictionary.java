package dictionary;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SaveableDictionary {

    private Map<String, String> translationDict;
    private String file;

    public SaveableDictionary() {
        this.translationDict = new HashMap<>();
    }    

    public SaveableDictionary(String file) {
        this();  //declare each time when there is new constructor
        this.file = file;
    }

    public boolean load() {

    try{    
        Scanner fileReader = new Scanner(Paths.get(this.file));
        while (fileReader.hasNextLine()) {
            String row = fileReader.nextLine();
            String[] split = row.split(":");
                
            String part1 = split[0];
            String part2 = split[1];
                
            this.translationDict.putIfAbsent(part1, part2);
            
        }
    } catch (Exception e) {
        System.out.println("The error message is " + e.getMessage());
        return false;
    }

    return true;
        
    }

    public void add(String words, String translation) {
        this.translationDict.putIfAbsent(words, translation);
    }

    public String translate(String word) {

        if (this.translationDict.containsKey(word)) {
            return this.translationDict.get(word);
        }

        for (Map.Entry<String, String> i : this.translationDict.entrySet()) {
            if (i.getValue().equals(word)) {
                return i.getKey();
            }
        }
        return null;
    }

    public void delete(String word) {

        this.translationDict.remove(word, this.translate(word));
        this.translationDict.remove(this.translate(word), word);

    }

    public boolean save() {
        
    try {
        PrintWriter saveFile = new PrintWriter(this.file);
        
        for (Map.Entry<String, String> entry : this.translationDict.entrySet()) {
            String part1 = entry.getKey();
            saveFile.println(part1 + ":" + this.translationDict.get(part1));
        }
        
        saveFile.close();
    } catch (Exception e) {
        System.out.println("The error message is " + e.getMessage());
        return false;
    }
        return true;
    }
}



