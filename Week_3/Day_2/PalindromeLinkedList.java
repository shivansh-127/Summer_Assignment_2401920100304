package Week_3.Day_2;

 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
     if(head == null && head.next == null) {
     return true;
   }
      ListNode mid = findMidNode(head);
      
      //Reverse
      ListNode curr = mid;
      ListNode prev = null;
      ListNode next;
      while(curr != null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
      }
      ListNode leftHead = head;
      ListNode rightHead = prev;
      while(rightHead != null) {
        if(leftHead.val != rightHead.val) {
            return false;
        }
        leftHead = leftHead.next;
        rightHead = rightHead.next;
      }
      return true;
    }
    public ListNode findMidNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
