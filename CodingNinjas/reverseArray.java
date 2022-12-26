package CodingNinjas;

import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class reverseArray {

    public static void reverseArray(ArrayList<Integer> arr, int m) {
        // Write your code here.
        int size = arr.size() - 1;
        int pos = m + 1;
        while (pos <= size) {
            Collections.swap(arr, pos, size);
            pos++;
            size--;
        }
    }

}
