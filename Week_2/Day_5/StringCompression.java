package Week_2.Day_5;

import java.util.Arrays;

/* TC: O(N)
   SC: O(1) */
public class StringCompression {
 public int compress(char[] chars) {
        int c = 1;
        int j = 1;
        for(int i=0; i<chars.length-1; i++) {
           if(chars[i] == chars[i+1]) {
               c++;
           }else{
              if(c != 1) {
                String s  = Integer.toString(c);
                for(int k=0; k<s.length(); k++) {
                    chars[j] = s.charAt(k);
                    j++;
                }
            
              }
              c = 1;
              chars[j] = chars[i+1];
              j++;
           }
        }
        if(c != 1) {
                String s  = Integer.toString(c);
                for(int k=0; k<s.length(); k++) {
                    chars[j] = s.charAt(k);
                    j++;
                }
            
              }
        return j;
    }
}
