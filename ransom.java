public class ransom {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int rl=ransomNote.length();
        int ml=magazine.length();
        if(rl>ml)
            return false;
        if(ransomNote.equals(magazine))
            return true;
        int count=0;
        for(int i=0;i<rl;i++){
            for(int j=0;j<ml;j++){
                if(ransomNote.charAt(i)==magazine.charAt(j)){
                    count++;
                    magazine=magazine.substring(0,j)+magazine.substring(j+1,ml);
                    System.out.println(magazine);
                    ml-=1;
                    break;
                }
            }
        }
        if(count>=rl)
            return true;
        else 
            return false;
    }
    public static void main(String[] args) {
        boolean ans=canConstruct("fihjjjjei","hjibagacbhadfaefdjaeaebgi");
        System.out.println(ans);
    }
}

// OPTIMIZED SOLUTION 
// public class Solution {
//     public boolean canConstruct(String ransomNote, String magazine) {
//         int[] arr = new int[26];
//         for (int i = 0; i < magazine.length(); i++) {
//             arr[magazine.charAt(i) - 'a']++;
//         }
//         for (int i = 0; i < ransomNote.length(); i++) {
//             if(--arr[ransomNote.charAt(i)-'a'] < 0) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }