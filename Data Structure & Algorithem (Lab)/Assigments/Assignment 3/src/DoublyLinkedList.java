public class DoublyLinkedList {

    Node head;

    class Node {

        int data;
        Node prev;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    void insert(int data) {

        Node node = new Node(data);
        node.next = null;

        Node last = head;

        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }

        last.next = node;

        node.prev = last;
    }

    void delete(int position) {

        if (head == null)
            return;

        Node temp = head;

        if (position == 0) {
            head = temp.next;
            return;
        }

        for (int i = 0; temp != null && i < position - 1; i++)
            temp = temp.next;

        if (temp == null || temp.next == null) {
            return;
        }

        Node next = temp.next.next;

        temp.next = next;

    }

    Node reverse(Node head) {

        if (head == null) {
            return null;
        }

        Node prev = null;
        Node current = head;
        Node next;

        do {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        } while (current != (head));


        (head).next = prev;
        head = prev;
        return head;
    }
}