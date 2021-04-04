package school;

public class SelectionSort {
    //Implementation for int

    private void swapInt(int[] a, int i, int j) {
        int s = a[j];
        a[j] = a[i];
        a[i] = s;
    }

    public void selectionSortInt(int[] a) {
        for (int k = 0; k<a.length-1; k++) {
            int j = k;
            for (int q = k+1; q<a.length; q++) {
                if (a[j] > a[q]) {
                    j = q ;
                }
            }
            swapInt (a, k, j) ;
        }
    }

    //Implementation for Strings

    private void swapStrings(String[] s, int i, int j) {
        String swap = s[j];
        s[j] = s[i];
        s[i] = swap;
    }

    public void selectionSortString(String[] a) {
        for (int k = 0; k<a.length-1; k++) {
            int j = k;
            for (int q = k+1; q<a.length; q++) {
                if (a[j].compareTo(a[q]) > 0) {
                    j = q ;
                }
            }
            swapStrings (a, k, j);
        }
    }

    //time complexity: O(n^2)
}
