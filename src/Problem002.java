import java.util.ArrayList;

/**
 * Created by adrabik on 10.02.16.
 * Even Fibonacci numbers
 */
public class Problem002 {
    public static void main(String[] args) {
        long sum=0;
        ArrayList<Integer> fibonacciSequence = new ArrayList<>(100);
        fillFibonacciSequenceUpTo4mln(fibonacciSequence);
        for (int x = 0; x < fibonacciSequence.size(); x++) {
            if (fibonacciSequence.get(x)%2==0) sum+=fibonacciSequence.get(x);
        }
        System.out.println(sum);
    }

    private static void fillFibonacciSequenceUpTo4mln(ArrayList<Integer> fibonacciSequence) {
        fibonacciSequence.add(1);
        fibonacciSequence.add(2);
        for (int x = 0; x <= 4_000_000; ) {
            x=getNextValueFromFibonacciSequence(fibonacciSequence);
            fibonacciSequence.add(x);
        }
    }

    private static int getNextValueFromFibonacciSequence(ArrayList<Integer> fibonacci){
        int size = fibonacci.size();
        return fibonacci.get(size-1)+fibonacci.get(size-2);
    }
}
