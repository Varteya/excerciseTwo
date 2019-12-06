//Given a string and a non-empty word string, return a version of the original String where
//all chars have been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.
//
//        plusOut("12xy34", "xy") → "++xy++"
//        plusOut("12xy34", "1") → "1+++++"
//        plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"

public class PlusOut {
    public String plusOut(String str, String word) {
        if (str == null) {
            throw new IllegalArgumentException("String should be not null");
        }
        if (word == null) {
            throw new IllegalArgumentException("Word should be not null");
        }
        String answer = "";
        if ((str.length() < word.length()) || (word.equals(""))) {
            for (int i = 0; i < str.length(); i++) {
                answer += "+";
            }
        } else {
            for (int i = 0; i < str.length(); i++) {
                if ((i + word.length() <= str.length()) && (str.substring(i, i + word.length())).equals(word)) {
                    answer += word;
                    i += word.length() - 1;
                } else {
                    answer += "+";
                }
            }
        }

        return answer;
    }
}
