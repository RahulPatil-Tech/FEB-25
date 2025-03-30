package ADS.Linked_list;

public class demo1 {
    int data;
    demo1 next;
    demo1(int d) {
        data = d;
        next = null;
    }
    public static void main(String[] args) {
        demo1 head = new demo1(5);
        head.next = new demo1(20);
        head.next.next = new demo1(30);
        head.next.next.next = new demo1(10);
        head.next.next.next.next = new demo1(5);
        // Print the linked list
        demo1 current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    // Time Complexity O(n)
    // Space Complexity O(1)
    // Auxiliary Space O(1)
}
