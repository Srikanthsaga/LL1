class LN8 {
    int val;
    LN8 next;

    LN8(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LL8 {
    public static LN8 deleteNodes(LN8 head, int M, int N) {
        if (head == null) {
            return null; // Empty list
        }

        LN8 current = head;
        LN8 prev = null;

        while (current != null) {
            int m = M;
            int n = N;

            // Traverse M nodes
            while (m > 0 && current != null) {
                prev = current;
                current = current.next;
                m--;
            }

            // Delete N nodes
            while (n > 0 && current != null) {
                current = current.next;
                n--;
            }

            // Connect the previous node with the next node after deleting N nodes
            prev.next = current;
        }

        return head;
    }

    public static void printList(LN8 head) {
        LN8 current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LN8 head1 = new LN8(1);
        head1.next = new LN8(2);
        head1.next.next = new LN8(3);
        head1.next.next.next = new LN8(4);
        head1.next.next.next.next = new LN8(5);
        head1.next.next.next.next.next = new LN8(6);
        head1.next.next.next.next.next.next = new LN8(7);
        head1.next.next.next.next.next.next.next = new LN8(8);

        LN8 head2 = new LN8(1);
        head2.next = new LN8(2);
        head2.next.next = new LN8(3);
        head2.next.next.next = new LN8(4);
        head2.next.next.next.next = new LN8(5);
        head2.next.next.next.next.next = new LN8(6);
        head2.next.next.next.next.next.next = new LN8(7);
        head2.next.next.next.next.next.next.next = new LN8(8);
        head2.next.next.next.next.next.next.next.next = new LN8(9);
        head2.next.next.next.next.next.next.next.next.next = new LN8(10);

        LN8 head3 = new LN8(1);
        head3.next = new LN8(2);
        head3.next.next = new LN8(3);
        head3.next.next.next = new LN8(4);
        head3.next.next.next.next = new LN8(5);
        head3.next.next.next.next.next = new LN8(6);
        head3.next.next.next.next.next.next = new LN8(7);
        head3.next.next.next.next.next.next.next = new LN8(8);
        head3.next.next.next.next.next.next.next.next = new LN8(9);
        head3.next.next.next.next.next.next.next.next.next = new LN8(10);

        int M1 = 2;
        int N1 = 2;
        int M2 = 3;
        int N2 = 2;
        int M3 = 1;
        int N3 = 1;

        System.out.println("Original linked list:");
        printList(head1);
        head1 = deleteNodes(head1, M1, N1);
}
}