package exercise;

import java.util.Map.Entry;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        KeyValueStorage buffer = new InMemoryKV(storage.toMap());
        for (Entry entry: buffer.toMap().entrySet()) {
            storage.unset((String) entry.getKey());
            storage.set((String) entry.getValue(), (String) entry.getKey());
        }
    }
}
// END
