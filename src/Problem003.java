import Functions.Primes;

import java.util.ArrayList;

/**
 * Created by adrabik on 10.02.16.
 * Largest prime factor of 600851475143
 */
public class Problem003 {
    public static void main(String[] args) {
        long value = 600_851_475_143L;
        for (long x = 2; x < value/2; x++) {
            if (x%100000000==0) System.out.println(x);
            if (value%x==0 && Primes.isPrime(value/x)) {
                System.out.println((value/x));
                break;
            }
        }
    }
}
