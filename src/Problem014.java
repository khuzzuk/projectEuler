import Functions.CollatzChain;

/**
 * Created by adrabik on 15.02.16.
 * Longest Collatz sequence
 */
public class Problem014 {
    public static void main(String[] args) {
        long longestSequenceNumber=0;
        int sequenceCount=0,maxSequence=0;
        int border = 1_000_000;
        for (int x = 2; x < border; x++) {
            sequenceCount= CollatzChain.countChainLength(x);
            if (sequenceCount>maxSequence) {
                longestSequenceNumber=x;
                maxSequence=sequenceCount;
            }
        }
        System.out.println(longestSequenceNumber);
    }
}
