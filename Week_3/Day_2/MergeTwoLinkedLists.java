package Week_3.Day_2;


 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
public class MergeTwoLinkedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merge = new ListNode(-1);
        ListNode t1 = list1;
        ListNode t2 = list2;
        ListNode m = merge;
        while(t1 != null && t2!=null) {
            if(t1.val <= t2.val) {
                m.next = new ListNode(t1.val);
                t1 = t1.next;
            }else{
                m.next = new ListNode(t2.val);
                t2 = t2.next;
            }
            m = m.next;
        }
        while(t1 != null) {
            m.next = new ListNode(t1.val);
            m = m.next;
            t1 = t1.next;
        }
        while(t2 != null) {
            m.next = new ListNode(t2.val);
            m = m.next;
            t2 = t2.next;
        }
        return merge.next;
    }
}
