import Functions.Primes;

import java.util.ArrayList;

/**
 * Created by adrabik on 12.02.16.
 * Highly divisible triangular number
 */
public class Problem012 {
    public static void main(String[] args) {
        ArrayList<Long> triangleSequence = new ArrayList<>(1_000_000);
        triangleSequence.add(1L);
        while (true){
            triangleSequence.add(triangleSequence.get(triangleSequence.size()-1)+triangleSequence.size()+1);
            if (Primes.countDivisors(triangleSequence.get(triangleSequence.size()-1))>500){
                System.out.println(triangleSequence.get(triangleSequence.size()-1));
                break;
            }
        }
    }
}
