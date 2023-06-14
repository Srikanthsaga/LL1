class LN10 {
    int val;
    LN10 next;

    LN10(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LL10 {
    public static boolean isCircular(LN10 head) {
        if (head == null) {
            return false;
        }

        LN10 slow = head;
        LN10 fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        LN10 first = new LN10(1);
        first.next = new LN10(2);
        first.next.next = new LN10(3);
        first.next.next.next = new LN10(4);
        first.next.next.next.next = new LN10(5);

        // Create a circular linked list
        first.next.next.next.next.next = first.next;

        boolean isCircular = isCircular(first);

        if (isCircular) {
            System.out.println("The linked list is circular.");
        } else {
            System.out.println("The linked list is not circular.");
        }
    }
}
