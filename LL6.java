class LN6 {
    char val;
    LN6 next;

    LN6(char val) {
        this.val = val;
        this.next = null;
    }
}

public class LL6 {
    public static boolean isPalindrome(LN6 head) {
        if (head == null || head.next == null) {
            return true; // An empty list or a list with one node is a palindrome
        }

        LN6 slow = head;
        LN6 fast = head;

        // Move the fast pointer two steps at a time and the slow pointer one step at a time
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // Reverse the second half of the linked list
        LN6 secondHalf = reverse(slow.next);

        LN6 firstHalf = head;
        LN6 secondHalfCopy = secondHalf;

        // Compare the reversed second half with the first half
        while (secondHalfCopy != null) {
            if (firstHalf.val != secondHalfCopy.val) {
                return false; // Not a palindrome
            }
            firstHalf = firstHalf.next;
            secondHalfCopy = secondHalfCopy.next;
        }

        return true; // The linked list is a palindrome
    }

    private static LN6 reverse(LN6 head) {
        LN6 prev = null;
        LN6 current = head;

        while (current != null) {
            LN6 next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        LN6 head1 = new LN6('R');
        head1.next = new LN6('A');
        head1.next.next = new LN6('D');
        head1.next.next.next = new LN6('A');
        head1.next.next.next.next = new LN6('R');

        LN6 head2 = new LN6('C');
        head2.next = new LN6('O');
        head2.next.next = new LN6('D');
        head2.next.next.next = new LN6('E');

        boolean isPalindrome1 = isPalindrome(head1);
        boolean isPalindrome2 = isPalindrome(head2);

        System.out.println("Is the first linked list a palindrome? " + isPalindrome1);
        System.out.println("Is the second linked list a palindrome? " + isPalindrome2);
    }
}
