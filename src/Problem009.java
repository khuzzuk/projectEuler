/**
 * Created by adrabik on 11.02.16.
 * Special Pythagorean triplet
 */
public class Problem009 {
    public static void main(String[] args) {
        double expectedSum = 1000F;
        double c;
        mainLoop:
        for (double a = 0; a < 500; a++) {
            for (double b = 0; b < 500; b++) {
                c = Math.sqrt(a*a+b*b);
                if (Double.compare(a+b+c,1000.0)==0){
                    System.out.println(a);
                    System.out.println(b);
                    System.out.println(c);
                    System.out.println((int)a*(int)b*(int)c);
                    break mainLoop;
                }
            }
        }
    }
}
