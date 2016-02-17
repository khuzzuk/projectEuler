/**
 * Created by adrabik on 10.02.16.
 * Smallest multiple
 */
public class Problem005 {
    public static void main(String[] args) {
        mainLoop:
        for (int x = 1; x < Integer.MAX_VALUE; x++) {
            for (int y = 1; y < 21; y++) {
                if (x%y!=0) continue mainLoop;
            }
            System.out.println(x);
            break;
        }
    }
}
