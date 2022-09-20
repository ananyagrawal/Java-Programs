package GFG;
class searchInSorted{
    static int searchinsorted(int arr[], int n, int k)
    {
        // Your code here
        int mid=n/2;
        int l=0;
        int r=n-1;
        while(l<=r){
            if(arr[mid]<k)
            l=mid+1;
            else if(arr[mid]==k)
                return 1;
            else
                r=mid-1; 
            mid=(l+r)/2;
        }
        return -1;
    }
}