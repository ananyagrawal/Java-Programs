package GFG;

public class secondLargest {
    int print2largest(int arr[], int n) {
        if(n<2)
        return -1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,arr[i]);
        }
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]!=max)
            secondLargest=Math.max(secondLargest,arr[i]);
        }
        if(secondLargest==Integer.MIN_VALUE)
        return -1;
        else
        return secondLargest;
    }
}
