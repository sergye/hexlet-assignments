package exercise;

import java.util.Map;
import java.util.stream.Collectors;

// BEGIN
abstract class Tag {
    private final String tag;
    private final Map attributes;

    Tag(String tag, Map attributes) {
        this.tag = tag;
        this.attributes = attributes;
    }

    public String getTag() {
        return tag;
    }


    public String getSpace() {
        return getResult().isEmpty() ? "": " ";
    }

    public String getResult() {
        return attributes.keySet().stream()
                .map(key -> key + "=\"" + attributes.get(key) + "\"")
                .collect(Collectors.joining(" "))
                .toString();
    }

    public abstract String toString();
}
// END
