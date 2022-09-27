package linkedlist.singly;

public class Main {

    public static void main(String[] args) {

        Node head = new Node(-1);
        head = appendToList(head, 1);
        head = appendToList(head, 2);
        head = appendToList(head, 3);
        head = appendToList(head, 4);
        head = appendToList(head, 5);
        head = appendToList(head, 6);

        printList(head.next);

    }

    static Node appendToList(Node head, int data) {
        Node temp = head;
        if(head.next == null) {
            Node node = new Node(data);
            head.next = node;
        }

        while(head.next != null) {
            head = head.next;
        }
        head.next = new Node(data);
        return temp;
    }

    static void printList(Node head) {
        if (head.next == null) return;
        while (head != null) {
            System.out.print(head.data + "\t");
            head = head.next;
        }
    }
}
