package CODEFORCES;
import java.util.*;
public class word_capitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String word = sc.next();
        char first = word.charAt(0);
        String capitalWord = String.valueOf(Character.toUpperCase(first))+word.substring(1);
        System.out.println(capitalWord);
    }
}
