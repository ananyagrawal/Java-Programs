package GFG;

import java.util.Arrays;

public class minimizeHeight1 {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        int result = arr[n - 1] - arr[0];
        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;
        for (int i = 0; i < n - 1; i++) {
            int min = Math.min(smallest, arr[i + 1] - k);
            int max = Math.max(largest, arr[i] + k);
            result = Math.min(result, max - min);
        }
        return result;
    }
}
