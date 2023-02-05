import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    public static void plusMinus(List<Integer> arr) {
        int l = arr.size();
        int p = 0, n = 0, z = 0;
        for (int i = 0; i < l; i++) {
            if (arr.get(i) > 0)
                p++;
            else if (arr.get(i) < 0)
                n++;
            else
                z++;
        }
        double pv = p / (double) l;
        double nv = n / (double) l;
        double zv = z / (double) l;
        System.out.printf("%f%n", pv);
        System.out.printf("%f%n", nv);
        System.out.printf("%f%n", zv);
    }

}

public class HackerRank3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
