package LEETCODE;

public class missingNumber {
    public int missingnumber(int[] nums) {
        int arraySum=0;
        int N=nums.length;
        for(int i=0;i<N;i++){
             arraySum+=nums[i];
        }
        int sum=(N*(N+1))/2;
        return sum-arraySum;
    }
}
