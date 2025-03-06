/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    static ListNode cem(ListNode l1, ListNode l2, int qaliq){
    int t=l1.val+l2.val+qaliq;
    if(l1.next==null && l2.next==null)
      return new ListNode(t%10,(t>=10)?(new ListNode(1)):null);
    else if(l1.next==null)
      return new ListNode(t%10,cem(new ListNode(0),l2.next,t/10));
    else if(l2.next==null)
      return new ListNode(t%10,cem(l1.next,new ListNode(0),t/10));
    
    return new ListNode(t%10,cem(l1.next,l2.next,t/10));
  }
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    return cem(l1,l2,0);
  }
}
