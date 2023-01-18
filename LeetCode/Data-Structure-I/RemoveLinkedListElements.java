class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        ListNode temp = new ListNode();
        temp.next = head;
        ListNode current = temp;

        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            }
            else {
                current = current.next;
            }
        }
        return temp.next;
    }
}
