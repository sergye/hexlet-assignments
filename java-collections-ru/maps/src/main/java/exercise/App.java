package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        String[] words = sentence.split(" ");
        Map<String, Integer> result = new HashMap<>();
        for (String word: words) {
            result.put(word, getCount(word, words));
        }
        if (sentence.equals("")) {
            result.clear();
        }
        return result;
    }

    public static String toString(Map<String, Integer> wordCount) {
        if (wordCount.isEmpty()) {
            return "{}";
        }
        String start = "{\n";
        String result = "";
        for (String key: wordCount.keySet()) {
            result = result + "  " + key + ": " + wordCount.get(key) + "\n";
        }
        System.out.println(start + result + "}");
        return start + result + "}";
    }

    private static Integer getCount(String word, String[] words) {
        Integer count = 0;
        for (String element: words) {
            if (element.equals(word)) {
                count++;
            }
        }
        return count;
    }
}
//END
