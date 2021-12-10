package item5;

import java.util.ArrayList;
import java.util.List;

public class WrongSpellChecker {

    private static final Lexicon dictionary = new Lexicon();

    private WrongSpellChecker() {}
    public static WrongSpellChecker INSTANCE = new WrongSpellChecker();

    public static boolean isValid(String word) {
        return false;
    }

    public static List<String> suggestions(String typo) {
        List<String> dummy = new ArrayList<>();
        return dummy;
    }
}
