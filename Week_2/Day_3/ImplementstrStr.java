package Week_2.Day_3;


//Time Complexity - O(m × n)
//Space Complexity - O(1) 

public class ImplementstrStr {
    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();
        for(int i=0; i<=(m-n); i++) {
            for(int j=0; j<n; j++) {
                if(haystack.charAt(i+j) != needle.charAt(j)) {
                    break;
                }
                if(j == n-1) {
                    return i;
                }
            }
        }
        return -1;
    }
}
