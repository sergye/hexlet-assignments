package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag{

    private static final String OPEN_BRACKET = "<";
    private static final String CLOSE_BRACKET = ">";

    private final String body;
    private final List children;
    PairedTag(String tag, Map attributes, String body, List children) {
        super(tag, attributes);
        this.body = body;
        this.children = children;
    }

    @Override
    public String toString() {
        String result = super.getResult();
        String space = super.getSpace();
        String tag = super.getTag();
        String closingTag = OPEN_BRACKET + "/" + tag + CLOSE_BRACKET;
        return OPEN_BRACKET + tag + space + result + CLOSE_BRACKET + body + getChildren(children) + closingTag;
    }

    private String getChildren(List<SingleTag> children) {
        return children.stream()
                .map(SingleTag::toString)
                .collect(Collectors.joining(""));
    }
}
// END
