import Functions.Pascal;

/**
 * Created by adrabik on 16.02.16.
 * Lattice paths
 */
public class Problem015 {
    private static int maxX, maxY;
    private static long pathsCounter;
    public static void main(String[] args) {
        pascals(20,20);
    }

    private static void pascals(int maxX, int maxY){
        System.out.println(Pascal.getValue(maxX+maxY,maxY));
    }

    private static void recursive() {
        pathsCounter=0;
        maxX=maxY=20;
        countMaxMoves(0,0);
        System.out.println(pathsCounter);
    }

    private static void countMaxMoves(int x, int y){
        if (x==maxX && y==maxY) {
            pathsCounter++;
            return;
        }
        if (x<=maxX) countMaxMoves(x+1,y);
        if (y<=maxY) countMaxMoves(x,y+1);
    }
}
