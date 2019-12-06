//A sandwich is two pieces of bread with something in between. Return the string that is between
// the first and last appearance of "bread" in the given string, or return the empty string ""
// if there are not two pieces of bread.
//
//        getSandwich("breadjambread") → "jam"
//        getSandwich("xxbreadjambreadyy") → "jam"
//        getSandwich("xxbreadyy") → ""

public class GetSandwich {

//    public static void main(String[] args) {
//        GetSandwich getSandwich = new GetSandwich();
//        String answer = getSandwich.getSandwich("xxbreadbreadjambreadyy");
//        System.out.println(answer);
//    }

    public String getSandwich(String str) {
        if (str == null) {
            throw new IllegalArgumentException("String should be not null");
        }
        int firstBreadIndex = -1;
        for (int i = 0; i < str.length() - 4; i++) {
            if (str.substring(i, i + 5).equals("bread")) {
                firstBreadIndex = i;
                break;
            }
        }
        if (firstBreadIndex == -1){
            return "";
        }
        int lastBreadIndex = firstBreadIndex;
        for (int i = str.length() - 5; i >= 0; i--) {
            if (str.substring(i, i + 5).equals("bread")) {
                lastBreadIndex = i;
                break;
            }
        }
        if (firstBreadIndex == lastBreadIndex) {
            return "";
        }
        return str.substring(firstBreadIndex + 5, lastBreadIndex);
    }
}
