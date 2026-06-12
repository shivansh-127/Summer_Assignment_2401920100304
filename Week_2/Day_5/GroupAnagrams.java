package Week_2.Day_5;


/* Time Complexity: O(N × K log K)
Space Complexity: O(N × K)
where N = number of strings and K = average length of a string. */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
      public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mp = new HashMap<>();

        for(int i=0; i<strs.length; i++) {
            String s = strs[i];
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
            s = String.valueOf(ch);
            if(mp.containsKey(s)) {
                mp.get(s).add(strs[i]);
            }else{
                mp.put(s, new ArrayList<>());
                mp.get(s).add(strs[i]);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(String s : mp.keySet()) {
            ans.add(mp.get(s));
        }
        return ans;
    }
}
