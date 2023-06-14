class LN2{
    int val;
    LN2 next;

    LN2(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LL2 {
    public static boolean hasLoop(LN2 head) {
        LN2 slow = head;
        LN2 fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true; // Loop detected
            }
        }

        return false; // No loop detected
    }

    public static void main(String[] args) {
        LN2 head = new LN2(1);
        head.next = new LN2(3);
        head.next.next = new LN2(4);
        head.next.next.next = head.next; // Creating a loop by connecting the last node to the second node

        boolean hasLoop = hasLoop(head);

        System.out.println("Linked List has a loop: " + hasLoop);
    }
}
