//Given two strings, word and a separator sep, return a big string made of count occurrences of the word,
// separated by the separator string.
//
//        repeatSeparator("Word", "X", 3) → "WordXWordXWord"
//        repeatSeparator("This", "And", 2) → "ThisAndThis"
//        repeatSeparator("This", "And", 1) → "This"


public class RepeatSeparator {

    public String repeatSeparator(String word, String sep, int count) {
        if (word == null) {
            throw new IllegalArgumentException("Word should be not null");
        }
        if (sep == null) {
            throw new IllegalArgumentException("Separator should be not null");
        }
        if (count <= 0) {
            return "";
        }
        String answer = word;
        for (int i = 1; i < count; i++) {
            answer = answer + sep + word;
        }
        return answer;
    }
}
