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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         int sum = 0;

        //first init
        ListNode resNode = new ListNode();
        ListNode copyNode = resNode;
        
        //start iteration
        while(l1 != null || l2 != null || sum != 0)
        {
            if(l1 != null)
            {
                sum += l1.val;
                l1 = l1.next;
            }
            
            if(l2 != null)
            {
                sum += l2.val;
                l2 = l2.next;
            }

            ListNode newNode = new ListNode();
            newNode.val = sum%10;
            copyNode.next = newNode;
            copyNode = newNode;
            
            sum /= 10;   //will always be 0 or 1
        }
        
        return resNode.next;
    }
}
