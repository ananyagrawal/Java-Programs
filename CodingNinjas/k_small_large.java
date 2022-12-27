package CodingNinjas;
import java.util.ArrayList;
import java.util.Collections;
public class k_small_large {
	public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
		//Write your code here
        ArrayList<Integer> res = new ArrayList<>();
        Collections.sort(arr);
        int small=arr.get(k-1);
        int large=arr.get(n-k);
        res.add(small);
        res.add(large);
        return res;
	}
}
