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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> l1 = new ArrayList<>();
        
        while(list1 != null){
            l1.add(list1.val);
            list1 = list1.next;
        }
        while(list2 != null){
            l1.add(list2.val);
            list2 = list2.next;
        }
        Collections.sort(l1);

        ListNode ans = new ListNode(-1);
        ListNode node = ans;
        for(int number: l1){
            node.next = new ListNode(number);
            node = node.next;
        }
        System.out.println(l1);
        return ans.next;
    }
}
