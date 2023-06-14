class LL4 {
    int val;
    LL4 next;

    LL4(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LL3 {
    public static int findNthFromEnd(LL4 head, int n) {
        LL4 first = head;
        LL4 second = head;

        // Move the first pointer N nodes ahead
        for (int i = 0; i < n; i++) {
            if (first == null) {
                return -1; // Invalid value of N
            }
            first = first.next;
        }

        // Move both pointers simultaneously
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Check if the value of N is valid
        if (second == null) {
            return -1; // Invalid value of N
        }

        return second.val;
    }

    public static void main(String[] args) {
        LL4 head = new LL4(1);
        head.next = new LL4(2);
        head.next.next = new LL4(3);
        head.next.next.next = new LL4(4);
        head.next.next.next.next = new LL4(5);
        head.next.next.next.next.next = new LL4(6);
        head.next.next.next.next.next.next = new LL4(7);
        head.next.next.next.next.next.next.next = new LL4(8);
        head.next.next.next.next.next.next.next.next = new LL4(9);

        int n = 2;

        int nthFromEnd = findNthFromEnd(head, n);

        System.out.println("Value of " + n + "th node from the end: " + nthFromEnd);
    }
}
