package practice;

public class StringReverse {

    public static void main(String[] args) {
        String str = "saurav";
        reverseStr(str);
    }

    private static void reverseStr(String str) {
        if(str.length() == 0){
            return;
        }

        String remainsingStr = str.substring(1);
        reverseStr(remainsingStr);
        System.out.print(str.charAt(0));
    }
}

/**
 * remainStr = aurav  str = saurav
 * remainStr = urav   str = aurav
 * remainStr = rav    str = urav
 * remainStr = av     str = rav
 * remainStr = v      str = av
 * remainStr = ''     str = v
 *
 * varuas
 */
