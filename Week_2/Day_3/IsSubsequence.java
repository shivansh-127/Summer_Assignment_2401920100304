package Week_2.Day_3;

// Time Complexity = O(n)
// Space Complexity = O(1)

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if(t.length() < s.length()) {
            return false;
        }
        int i = 0;
        int j = 0;
         while(i < s.length() && j < t.length()) {
            if(s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
         }
         if(i == s.length()) {
            return true;
         }
         return false;
    }
}
