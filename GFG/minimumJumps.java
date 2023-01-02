package GFG;

class minimumJumps {
    static int minJumps(int[] arr) {
        // your code here
        int count = 0;
        int max = 0;
        int current = 0;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            max = Math.max(max, arr[i] + i);
            if (current >= len - 1)
                return count;
            else if (max <= i)
                return -1;
            else if (current == i) {
                current = max;
                count++;
            }
        }
        return count;
    }
}
