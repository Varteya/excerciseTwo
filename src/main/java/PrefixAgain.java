//Given a string, consider the prefix string made of the first N chars of the string.
// Does that prefix string appear somewhere else in the string?
// Assume that the string is not empty and that N is in the range 1..str.length().
//
//        prefixAgain("abXYabc", 1) → true
//        prefixAgain("abXYabc", 2) → true
//        prefixAgain("abXYabc", 3) → false


public class PrefixAgain {

    public boolean prefixAgain(String str, int n) {
        if (str.length() == 0 || n <= 0 || str.length() < n) {
            return false;
        }
        String prefix = str.substring(0, n);
        for (int i = 1; i < str.length() - n + 1; i++) {
            if ((str.substring(i, i + n)).equals(prefix)) {
                return true;
            }
        }
        return false;
    }

}

