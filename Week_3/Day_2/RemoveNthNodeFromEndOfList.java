package Week_3.Day_2;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
  
public class RemoveNthNodeFromEndOfList {
      public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null && n == 1) return null;
        int sz = 0;
        ListNode temp = head;
        while(temp != null) {
            temp = temp.next;
            sz++;
        }
        int st = 1;
        int dest = sz-n+1;
        if(dest == 1) {
            head = head.next;
            return head;
        }
        temp = head;
        while(st < dest-1) {
            temp = temp.next;
            st++;
        }
        temp.next = temp.next.next;
        return head;

    }
}
