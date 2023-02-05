package LEETCODE;
class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int n=s.length()-1;
        int count=0;
        while(n>=0){
            if(s.charAt(n)==' ')
                break;
            else
                count++;
            n--;
        }
        return count;
    }
}