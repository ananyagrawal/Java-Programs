package GFG;
public class quikleftrotation {
    void leftRotate(long arr[], int k,int n)
    {
        k=k%n;
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
    }
    void reverse(long a[], int i, int j)
    {
        long temp=0;
        while(i<j){
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }
}
