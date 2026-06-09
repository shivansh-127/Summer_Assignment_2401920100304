package Week_2.Day_2;

import java.util.HashMap;

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length()) {
            return false;
        }
        HashMap<Character, Integer> s1c = new HashMap<>();
            
            HashMap<Character, Integer>  s2c = new HashMap<>();
        for(int i=0; i<s1.length(); i++) {
            s1c.put(s1.charAt(i), s1c.getOrDefault(s1.charAt(i), 0)+1);
            s2c.put(s2.charAt(i), s2c.getOrDefault(s2.charAt(i), 0)+1);
        }
        if(s1c.equals(s2c)) {
            return true;
        }
        int l = 0;
        for(int r=s1.length(); r<s2.length(); r++) {
            char ri = s2.charAt(r);
            s2c.put(ri, s2c.getOrDefault(ri, 0)+1);
            char le = s2.charAt(l);
            l++;
            s2c.put(le, s2c.get(le)-1);
            if(s2c.get(le)==0) {
                s2c.remove(le);
            }
            if(s1c.equals(s2c)) {
                return true;
            }
           }
        return false;
    }
}
