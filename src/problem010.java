import Functions.Primes;

import java.util.ArrayList;

/**
 * Created by adrabik on 11.02.16.
 * Summation of primes
 */
public class problem010 {
    public static void main(String[] args) {
        long sum=0;
        long primesLessOrEqualThan = 2_000_000L;
        ArrayList<Long> list = Primes.listPrimes(primesLessOrEqualThan);
        for (int x = 0; x < list.size()-1; x++) {
            sum+=list.get(x);
        }
        System.out.println(sum);
    }
}
