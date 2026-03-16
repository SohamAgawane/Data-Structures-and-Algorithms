public class LinkedListCycleII {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) break;
        }


        if (slow == fast) {
            ListNode curr = head;
            while (curr != slow) {
                curr = curr.next;
                slow = slow.next;
            }
            return curr;
        }

        return null;
    }
}
