/**
 * Created by adrabik on 10.02.16.
 * Largest palindrome product
 */
public class Problem004 {
    public static void main(String[] args) {
        String number;
        int maxNumber=0;
        for (int x = 999; x > 0; x--) {
            for (int y = 999; y > 0; y--) {
                number=""+(x*y);
                if (isPalindrome(number)){
                    if (maxNumber<x*y) maxNumber=x*y;
                }
            }
        }
        System.out.println(maxNumber);
    }
    private static boolean isPalindrome(String str){
        if (str.length()==0) return false;
        for (int x = 0; x < str.length()/2; x++) {
            if (str.charAt(x)!=str.charAt(str.length()-x-1)) return false;
        }
        return true;
    }
}
