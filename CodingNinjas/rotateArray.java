package CodingNinjas;

import java.util.*;
import java.io.*;

class rotateArray {

    public static void main(String args[]) {

        // Write code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int temp[] = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = a[i];
        }
        for (int i = k; i < N; i++) {
            a[i - k] = a[i];
        }
        int j = 0;
        for (int i = N - k; i < N; i++) {
            a[i] = temp[j];
            j++;
        }
        for (int i = 0; i < N; i++) {
            System.out.print(a[i] + " ");
        }
    }
}