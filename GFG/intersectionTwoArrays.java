package GFG;

import java.util.*;

public class intersectionTwoArrays {
    // Function to return the count of the number of elements in
    // the intersection of two arrays.
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        // Your code here
        int count = 0;
        Set<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < n; i++)
            s.add(a[i]);
        for (int j = 0; j < m; j++) {
            if (s.contains(b[j]))
                count++;
            s.remove(b[j]);
        }
        return count;
    }
}
