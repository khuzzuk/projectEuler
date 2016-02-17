package Functions;

/**
 * Created by adrabik on 15.02.16.
 */
public class CollatzChain {
    public static int countChainLength(long number){
        int count=1;
        while(number!=1){
            if (number%2==0){
                number/=2;
                count++;
            }
            else {
                number = number*3+1;
                count++;
            }
        }
        return count;
    }
}
