package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String symbols, String word) {
        String[] symbolArr = symbols.split("");
        String[] wordArr = word.toLowerCase().split("");
        List<String> symbolList = List.of(symbolArr);
        List<String> wordList = List.of(wordArr);
        if (symbolList.containsAll(wordList)) {
            for (String symbol: wordList){
                int wordFrequency = Collections.frequency(wordList, symbol);
                int symbolFrequency = Collections.frequency(symbolList, symbol);
                if (symbolFrequency < wordFrequency) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
//END
