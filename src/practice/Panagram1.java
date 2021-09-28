package practice;

import java.util.HashMap;

public class Panagram1 {
    public static void main(String[] args) {
        String num = "1023985764022";
        boolean result = checkPanagram(num);

        if(result){
            System.out.println("Number is panagram");
        }else{
            System.out.println("Number is not a panagram");
        }
    }

    private static boolean checkPanagram(String num) {

        int[] count = new int[10];

        for(int i=0;i<num.length(); i++){
            char digit = num.charAt(i);
            int intvalue = Character.getNumericValue(digit);
            count[intvalue]++;
        }

        for(int i=0;i<count.length;i++){
            if(count[i]<1){
                return false;
            }
        }
        return true;
    }
}
