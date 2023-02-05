package CodingNinjas;
import java.io.*;
import java.util.*;
public class maxminsum {
  public static int sumOfMaxMin(int[] arr, int n) {
      // Write your code here.
      int min=arr[0];
      int max=arr[0];
      for(int i=1;i<n;i++){
          if(arr[i]>max)
              max=arr[i];
          if(arr[i]<min)
              min=arr[i];
      }
      return max+min;
    }
}
