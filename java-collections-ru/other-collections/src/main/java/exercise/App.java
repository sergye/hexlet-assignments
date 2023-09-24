package exercise;

import java.util.*;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static LinkedHashMap<String, String> genDiff(Map<String, Object> data1, Map<String, Object> data2) {
        Set<String> diffKeys = new TreeSet<>();
        diffKeys.addAll(data1.keySet());
        diffKeys.addAll(data2.keySet());

        return diffKeys.stream()
                .collect(Collectors.toMap(
                        x -> x,
                        x -> getDiffProperty(x, data1, data2),
                        (x, y) -> y,
                        LinkedHashMap::new));
    }

    private static String getDiffProperty(String key,
                                          Map<String, Object> data1,
                                          Map<String, Object> data2) {
        if (!data1.containsKey(key) && data2.containsKey(key)) {
            return "added";
        }
        if (data1.containsKey(key) && !data2.containsKey(key)) {
            return "deleted";
        }
        if (!Objects.equals(data1.get(key), data2.get(key))) {
            return "changed";
        }
        return "unchanged";
    }
}
//END
