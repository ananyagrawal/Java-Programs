package LEETCODE;

public class checkSorted {

    public boolean check(int[] nums) {
        int c = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                c++;
            }
            if (c > 1)
                return false;
        }
        if (nums[0] < nums[nums.length - 1] && c != 0)
            return false;
        else
            return true;
    }

}
