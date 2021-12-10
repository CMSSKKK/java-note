package item5;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SpellChecker {
    private final Lexicon dictionary;

    public SpellChecker(Lexicon dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }

    public static boolean isValid(String word) {
        return false;
    }

    public static List<String> suggestions(String typo) {
        List<String> dummy = new ArrayList<>();
        return dummy;
    }
}
