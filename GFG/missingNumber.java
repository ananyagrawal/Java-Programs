package GFG;

public class missingNumber {
    public static int missingnumber(int A[], int N)
    {
         // Your code goes here
         int arraySum=0;
         for(int i=0;i<N-1;i++){
             arraySum+=A[i];
         }
         int sum=(N*(N+1))/2;
         return sum-arraySum;
    }
}
