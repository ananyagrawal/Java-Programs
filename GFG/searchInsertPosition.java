package GFG;

public class searchInsertPosition {
    static int searchInsertK(int Arr[], int N, int k)
    {
        // code here
        int left=0;
        int right=N-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(Arr[mid]==k)
            return mid;
            else if(Arr[mid]>k){
                right=mid-1;
            }
            else
            left=mid+1;
        }
        return left;
    }
}
