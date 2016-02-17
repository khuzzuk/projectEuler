package Functions;

/**
 * Created by adrabik on 17.02.16.
 */
public class Factorial {
    public static long factorial(int number){
        long value = 1;
        for (int x = 1; x <= number; x++) {
            value*=x;
        }
        return value;
    }
}
