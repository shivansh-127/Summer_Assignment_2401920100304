package Week_2.Day_2;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        HashMap<Character, Integer> mp = new HashMap<>();
        int ml = 1;
        int si = 0;
        int n = s.length();
        int cl = 0;
        for(int i=0; i<n; i++) {
            if(mp.containsKey(s.charAt(i))) {
             cl = i - si;
            ml = Math.max(ml,cl);
                if(mp.get(s.charAt(i)) >= si) {
            si = mp.get(s.charAt(i))+1;
                }
            }
            
            mp.put(s.charAt(i), i);
        }
        cl = n-si;
        ml = Math.max(ml,cl);
        return ml;
    }
}
