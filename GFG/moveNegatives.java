package GFG;

public class moveNegatives {
    public void segregateElements(int arr[], int n) {
        // Your code goes here
        int neg[] = new int[n];
        int pos[] = new int[n];
        int ncount = 0;
        int pcount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                neg[ncount++] = arr[i];
            } else {
                pos[pcount++] = arr[i];
            }
        }
        for (int i = 0; i < pcount; i++) {
            arr[i] = pos[i];
        }
        int r = 0;
        for (int i = pcount; i < n; i++) {
            arr[i] = neg[r++];
        }
    }
}