package src.main.java.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// BEGIN
public class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        List<Map<String, String>> result = new ArrayList<>();
        for (Map<String, String> book: books) {
            if (book.values().containsAll(where.values())) {
                result.add(book);
            }
        }
        return result;
    }
}
//END
