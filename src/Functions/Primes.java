package Functions;

import java.util.ArrayList;

/**
 * Created by adrabik on 11.02.16.
 */
public class Primes {
    public static boolean isPrime(long number){
        for (long x = 2; x*x < number; x++) {
            if (number%x==0) return false;
        }
        return true;
    }

    /**
     *
     * @param lessOrEqualThan Can't be less than 4
     * @return
     */
    public static ArrayList<Long> listPrimes(long lessOrEqualThan){
        if (lessOrEqualThan<4) throw new IllegalArgumentException();
        ArrayList<Long> primes = new ArrayList<Long>(1000000);
        primes.add(2L);
        primes.add(3L);
        mainLoop:
        for (long x = 4; x <= lessOrEqualThan; x++) {
            for (long y = 2; y*y<=x; y++) {
                if (x % y == 0) continue mainLoop;
            }
            primes.add(x);
            if (primes.size()%100==0) System.out.println("Actual prime = " + primes.get(primes.size()-1));
        }
        primes.add(1L);
        return primes;
    }

    public static int countDivisors(long number){
        int divisorsCount = 0;
        long sqrt = (long) Math.sqrt(number);
        for (int x = 2; x < sqrt; x++) {
            if (number%x==0) divisorsCount+=2;
        }
        return divisorsCount;
    }
}
