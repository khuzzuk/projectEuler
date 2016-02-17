package Functions;

import java.util.Arrays;

/**
 * Created by adrabik on 17.02.16.
 */
public class Pascal {
    public static long getValueRecursively(int row, int col){
        if (col==0 || row==col) return 1;
        return getValueRecursively(row-1,col)+ getValueRecursively(row-1,col-1);
    }
    public static long getValue(int row, int col){
        long[] previousRow;
        long[] currentRow={1L};
        for (int x = 2; x <= row+1; x++) {
            previousRow=currentRow;
            currentRow = new long[x];
            currentRow[0]=1;currentRow[x-1]=1;
            for (int y = 0; y < x - 2; y++) {
                currentRow[y+1] = previousRow[y]+previousRow[y+1];
            }
        }
        return currentRow[col];
    }
}
