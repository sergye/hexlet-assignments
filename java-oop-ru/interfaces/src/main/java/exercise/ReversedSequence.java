package exercise;

import java.util.stream.IntStream;

// BEGIN
public class ReversedSequence implements CharSequence {
    private static String string = null;

    public ReversedSequence(String string) {
        ReversedSequence.string = string;
    }

    public static String reverse() {
        return new StringBuilder(string).reverse().toString();
    }

    @Override
    public int length() {
        return string.length();
    }

    @Override
    public char charAt(int index) {
        return reverse().charAt(index);
    }

    @Override
    public boolean isEmpty() {
        return string.isEmpty();
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return reverse().substring(start, end);
    }

    @Override
    public IntStream chars() {
        return reverse().chars();
    }

    @Override
    public IntStream codePoints() {
        return reverse().codePoints();
    }

    @Override
    public String toString() {
        return reverse();
    }
}
// END
