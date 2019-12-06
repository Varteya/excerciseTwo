//Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
//Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
//
//        zipZap("zipXzap") → "zpXzp"
//        zipZap("zopzop") → "zpzp"
//        zipZap("zzzopzop") → "zzzpzp"

public class ZipZap {

    public String zipZap(String str) {
        if (str == null) {
            throw new IllegalArgumentException("String should be not null");
        }
        String answer = "";
        if (str.length() < 3) {
            return str;
        }
        for (int i = 0; i < str.length(); i++) {
            if ((i < str.length() - 2) && (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p')) {
                answer = answer + "zp";
                i += 2;
            } else {
                answer = answer + str.charAt(i);
            }
        }
        return answer;
    }

}
