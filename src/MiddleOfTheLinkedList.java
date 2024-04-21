// Incomplete
public class MiddleOfTheLinkedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static int listNodeSize(ListNode head) {
        if (head == null) return 0;

        ListNode temp = head;
        int count = 0;

        while (temp != null) {
            System.out.println("index:[" + count + "] value:" + temp.val);
            temp = temp.next;
            count++;
        }

        return count;

    }

    public static ListNode middleNode(ListNode head) {
        // 1. look for middle node. Get the middle index.
        int listNodeSize = listNodeSize(head);
        int midIndex = (int) (double) (listNodeSize / 2);
        System.out.println(midIndex);

        // 2. remove nodes before the middle node.

        return null;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(3);
        ListNode b = new ListNode(2, a);
        ListNode c = new ListNode(1, b);
        ListNode d = new ListNode(4, c);
        ListNode e = new ListNode(5, d);

        System.out.println("ListNode size is: " + listNodeSize(e));
        System.out.println("middle node is: " + middleNode(e));
    }
}
