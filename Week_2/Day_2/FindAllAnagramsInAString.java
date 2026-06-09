package Week_2.Day_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAllAnagramsInAString {
     public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if(p.length() > s.length()) {
            return list;
        }
        HashMap<Character, Integer> sc = new HashMap<>();
        HashMap<Character, Integer> pc = new HashMap<>();
        for(int i=0; i<p.length(); i++) {
            sc.put(s.charAt(i), sc.getOrDefault(s.charAt(i), 0)+1);
            pc.put(p.charAt(i), pc.getOrDefault(p.charAt(i), 0)+1);
        }
        if(sc.equals(pc)) {
            list.add(0);
        }
        int l = 0;
        for(int r=p.length(); r<s.length(); r++) {
            char ri = s.charAt(r);
            sc.put(ri, sc.getOrDefault(ri, 0)+1);
            char le = s.charAt(l);
            sc.put(le, sc.get(le)-1);
            if(sc.get(le)== 0) {
                sc.remove(le);
            }
            l++;
            if(sc.equals(pc)) {
                list.add(l);
            }
        }
        return list;
    }
}
