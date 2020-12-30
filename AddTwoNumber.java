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
public class AddTwoNumber{
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode l3 = new ListNode();
            ListNode temp = l3;
            int extra = 0;
            while(!(l1 == null && l2 == null)){
                if(l1 == null && l2 != null){
                    l1 = new ListNode();
                }else if(l1 != null && l2 == null){
                    l2 = new ListNode();
                }
                if((l1.val + l2.val + extra)>=10){
                    temp.val = (l1.val + l2.val + extra)%10;
                    extra = 1;
                }else{
                    temp.val = l1.val + l2.val + extra;
                    extra = 0;
                }
                l1 = l1.next;
                l2 = l2.next;
                if(l1 == null && l2 == null){
                    if(extra==1){
                        temp.next = new ListNode(extra);
                        temp = temp.next;
                        return l3;
                    }else{
                        temp.next = null;
                        temp = temp.next;
                        return l3;
                    }
                }else{
                    temp.next = new ListNode();
                    temp = temp.next;
                }
            }
            return l3;
        }
    }
}
