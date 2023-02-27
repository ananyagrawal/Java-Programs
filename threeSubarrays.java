public class threeSubarrays {
    public static long maxSum(int[] A, int N) {
        long maxSum = 0;

        // Iterate through all possible middle subarrays
        for (int i = 1; i < N - 1; i++) {

            // Find the maximum sum of prefix subarray I1
            long maxPrefixSum = 0;
            long prefixSum = 0;
            for (int j = 0; j < i; j++) {
                prefixSum += A[j];
                maxPrefixSum = Math.max(maxPrefixSum, prefixSum);
            }

            // Find the maximum sum of suffix subarray I3
            long maxSuffixSum = 0;
            long suffixSum = 0;
            for (int k = N - 1; k > i + 1; k--) {
                suffixSum += A[k];
                maxSuffixSum = Math.max(maxSuffixSum, suffixSum);
            }

            // Find the maximum sum of middle subarray I2
            long maxMidSum = 0;
            long midSum = 0;
            for (int l = i; l <= N - 2; l++) {
                midSum += A[l];
                maxMidSum = Math.max(maxMidSum, midSum);
            }

            // Find the maximum total sum of the three subarrays
            long totalSum = maxPrefixSum + maxMidSum + maxSuffixSum;
            maxSum = Math.max(maxSum, totalSum);
        }

        return maxSum;
    }

    public static void main(String args[]) {
        int A[] = { -6, -2, 1, -4, 5, 2 };
        long res = maxSum(A, 6);
        System.out.println(res);
    }
}
