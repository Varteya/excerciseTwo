//Given a string and a non-empty word string, return a string made of each char just before and
// just after every appearance of the word in the string. Ignore cases where there is no char
// before or after the word, and a char may be included twice if it is between two words.
//
//        wordEnds("abcXY123XYijk", "XY") → "c13i"
//        wordEnds("XY123XY", "XY") → "13"
//        wordEnds("XY1XY", "XY") → "11"

public class WordEnds {

    public String wordEnds(String str, String word) {
        if (str == null) {
            throw new IllegalArgumentException("String should be not null");
        }
        if (word == null) {
            throw new IllegalArgumentException("Word should be not null");
        }
        if (word.equals("")) {
            return "";
        }
        if (str.length() <= word.length()) {
            return "";
        }
        String answer = "";
        for (int i = 0; i <= str.length() - word.length(); i++) {
            if (str.substring(i, i + word.length()).equals(word)) {
                int indexBefore = i - 1;
                if (indexBefore >= 0){
                    answer += str.charAt(indexBefore);
                }
                int indexAfter = i + word.length();
                if (indexAfter < str.length()) {
                    answer += str.charAt(indexAfter);
                }
            }
        }
        return answer;
    }
}
