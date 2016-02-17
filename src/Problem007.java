/**
 * Created by adrabik on 10.02.16.
 * 10001st prime
 */
public class Problem007 {
    public static void main(String[] args) {
        int counter=0;
        int targetCounter = 10002;
        mainLoop:
        for (long x = 1; x < Long.MAX_VALUE; x++) {
            for (long y = x/2; y > 1; y--) {
                if (x%y==0) continue mainLoop;
            }
            counter++;
            if (counter%100==0) System.out.println(counter);
            if (counter==targetCounter){
                System.out.println(x);
                break;
            }
        }
    }
}
