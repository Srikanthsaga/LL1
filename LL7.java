class LN7 {
    int val;
    LN7 next;

    LN7(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LL7 {
    public static int removeLoop(LN7 head) {
        if (head == null || head.next == null) {
            return -1; // No loop present
        }

        LN7 slow = head;
        LN7 fast = head;

        // Detect the loop in the linked list
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break; // Loop detected
            }
        }

        // If loop exists, find the starting point of the loop
        if (slow == fast) {
            slow = head;
            while (slow.next != fast.next) {
                slow = slow.next;
                fast = fast.next;
            }
            fast.next = null; // Remove the loop
            return slow.val;
        }

        return -1; // No loop present
    }

    public static void main(String[] args) {
        LN7 head = new LN7(1);
        head.next = new LN7(3);
        head.next.next = new LN7(4);
        head.next.next.next = head.next; // Creating a loop

        int removedValue = removeLoop(head);

        if (removedValue != -1) {
            System.out.println("The starting point of the loop was " + removedValue);
        } else {
            System.out.println("No loop present in the linked list");
        }
    }
}
