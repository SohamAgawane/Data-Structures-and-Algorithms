public class SortLL {
     public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    public ListNode sortList(ListNode head) {
        if(head == null) return null;

        ListNode end = null;

        while(end != head) {
            ListNode curr = head;

            while(curr.next != end) {
                if(curr.val > curr.next.val) {
                    int temp = curr.val;
                    curr.val = curr.next.val;
                    curr.next.val = temp;
                }
                curr = curr.next;
            }

            end = curr;
        }
        return head;
    }
}
