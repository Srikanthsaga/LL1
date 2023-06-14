class LN9 {
    int val;
    LN9 next;

    LN9(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LL9 {
    public static void mergeLists(LN9 first, LN9 second) {
        if (first == null || second == null) {
            return;
        }

        LN9 current1 = first;
        LN9 current2 = second;

        while (current1 != null && current2 != null) {
            LN9 temp1 = current1.next;
            LN9 temp2 = current2.next;

            current1.next = current2;
            current2.next = temp1;

            current1 = temp1;
            current2 = temp2;
        }

        second = current2;
    }

    public static void printList(LN9 head) {
        LN9 current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LN9 first = new LN9(5);
        first.next = new LN9(7);
        first.next.next = new LN9(17);
        first.next.next.next = new LN9(13);
        first.next.next.next.next = new LN9(11);

        LN9 second = new LN9(12);
        second.next = new LN9(10);
        second.next.next = new LN9(2);
        second.next.next.next = new LN9(4);
        second.next.next.next.next = new LN9(6);

        System.out.println("First list before merging:");
        printList(first);
        System.out.println("Second list before merging:");
        printList(second);

        mergeLists(first, second);

        System.out.println("First list after merging:");
        printList(first);
        System.out.println("Second list after merging:");
        printList(second);
    }
}
