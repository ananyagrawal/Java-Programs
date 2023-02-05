package GFG;

public class k_smallest {
        public static int kthSmallest(int[] arr, int l, int r, int k) 
        { 
            //Your code here
            int pivot=partition(arr,l,r);
            if(k-1<pivot)
                kthSmallest(arr,l,pivot-1,k);
            else if(k-1>pivot)
                kthSmallest(arr,pivot+1,r,k);
            return arr[k-1];
        } 
        public static int partition(int[] a,int start,int end){
            int i=start-1;
            int pivot=end;
            for(int j=start;j<=end;j++){
                if(a[j]<a[pivot]){
                    i++;
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            int temp=a[i+1];
            a[i+1]=a[pivot];
            a[pivot]=temp;
            return i+1;
        }
}
