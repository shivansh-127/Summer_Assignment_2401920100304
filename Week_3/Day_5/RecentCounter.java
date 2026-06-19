package Week_3.Day_5;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {
    Queue<Integer> q = new LinkedList<>();
    public RecentCounter() {
       
    }
    
    public int ping(int t) {
       q.offer(t);
       while(q.peek() < t-3000) {
        q.poll();
       }
       return q.size();
    }
}
