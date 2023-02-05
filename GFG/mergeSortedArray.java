package GFG;
import java.util.*;
public class mergeSortedArray {
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=0;i<n;i++)
            set.add(arr1[i]);
        
        for(int i=0;i<m;i++)
            set.add(arr2[i]);
        
        for(int x:set)
            ar.add(x);
            Collections.sort(ar);
            
        return ar;
    }
}
