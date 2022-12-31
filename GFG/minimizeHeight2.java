package GFG;

import java.util.Arrays;

class minimizeHeight2 {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        int result = arr[n - 1] - arr[0];
        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;
        int min, max;
        for (int i = 0; i < n - 1; i++) {
            min = Math.min(smallest, arr[i + 1] - k);
            max = Math.max(largest, arr[i] + k);
            if (min < 0)
                continue;
            result = Math.min(result, max - min);
        }
        return result;
    }
}
