package Week_2.Day_3;

//Time Complexity O(n²) 
//Space Complexity O(n)

public class RepeatedSubstringPattern {
     public boolean repeatedSubstringPattern(String s) {
        String d = s + s;
        String str = d.substring(1, d.length()-1);
        return str.contains(s);
    }
}