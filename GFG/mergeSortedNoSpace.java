package GFG;

public class mergeSortedNoSpace {

    // Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) {
        // code here
        int l = 0, r = 0;
        for (int i = 0; i < n; i++) {
            if (arr1[l] > arr2[r]) {
                long temp = arr1[l];
                arr1[l] = arr2[r];
                arr2[r] = temp;
                long elem = arr2[r];
                int j;
                for (j = 1; j < m; j++) {
                    if (arr2[j] >= elem)
                        break;
                    else
                        arr2[j - 1] = arr2[j];
                }
                arr2[j - 1] = elem;
            }
            l++;
        }
    }

}
