package sort;

import static common.PrimitiveOperations.swap;
import static common.PrimitiveOperations.less;

public class InsertionSort {
    public static Comparable[] sort(Comparable[] sorted) {
        for(int i = 1; i < sorted.length; i++) {
            int j = i;
            while (j > 0 && less(sorted[j],sorted[j - 1])) {
                swap(sorted, j, j - 1);
                j--;
            }
        }
        return sorted;
    }
}
