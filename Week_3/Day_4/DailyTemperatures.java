package Week_3.Day_4;

import java.util.Stack;

public class DailyTemperatures {
     public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        
        for(int i=n-1; i>=0; i--) {
           while(!st.isEmpty() && temperatures[i] >= temperatures[st.peek()]) {
               st.pop();
           }
           if(st.isEmpty()) {
            ans[i] = 0;
           }else{
           ans[i] = st.peek()-i;
           }
           st.push(i);
        }
        return ans;
    }
}
