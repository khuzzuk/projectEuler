/**
 * Created by adrabik on 10.02.16.
 * Sum square difference
 */
public class Problem006 {
    public static void main(String[] args) {
        int sum=0;
        int sumOfSquares=0;
        for (int x = 1; x <= 100; x++) {
            sumOfSquares+=(x*x);
            sum+=x;
        }
        int largeSum = sum*sum;
        System.out.println((largeSum-sumOfSquares));
    }
}
