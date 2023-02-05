package LEETCODE;

class k_largest {
    public int partition(int arr[], int l, int r){
        int pivot=arr[r];
        int i=l;
        for(int j=l;j<=r;j++){
            if(arr[j]<pivot){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
        int temp=arr[i];
        arr[i]=arr[r];
        arr[r]=temp;
        return i;
    }
    public int findKthLargest(int[] nums, int k) {
        k=nums.length-k;
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int pos=partition(nums,l,r);
            if(pos>k)
            r=pos-1;
            else if(pos<k)
            l=pos+1;
            else
            return nums[pos];
        }
        return nums[k];
    }
}