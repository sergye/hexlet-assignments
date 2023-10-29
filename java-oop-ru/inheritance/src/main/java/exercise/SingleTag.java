package exercise;

import java.util.Map;

// BEGIN
public class SingleTag extends Tag{

    SingleTag(String tag, Map attributes) {
        super(tag, attributes);
    }

    @Override
    public String toString() {
        String tag = super.getTag();
        String space = super.getSpace();
        String result = super.getResult();
        return "<" + tag + space + result + ">";
    }
}
// END
