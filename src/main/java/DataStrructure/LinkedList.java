package DataStrructure;

import java.util.Scanner;

public class LinkedList {
    Node head = null;
    int n = 5;

    public void Insertion() {
        int data;
        while (n != 0){
            Scanner sc = new Scanner(System.in);
            data = sc.nextInt();
            Node nd = new Node(data);
            if (head == null){
                head = nd;
            }
            else {
                System.out.println("press 1 for Insertion in the beginning,press 2 for Insertion at the end ,press 3 for Insertion at a specific position");
                int c = sc.nextInt();
                switch (c) {
                    case 1:
                        nd.next = head;
                        head = nd;
                        break;
                    case 2:
                        Node temp = head;
                        while (temp.next != null) {
                            temp = temp.next;
                        }
                        temp.next = nd;
                        break;
                    case 3:
                        System.out.println("Enter position");
                        int p = sc.nextInt();
                        Node temp1 = head;
                        for (int i = 0 ; i < p-1 ; i++){
                            temp1 = temp1.next;
                        }
                        nd.next = temp1.next;
                        temp1.next = nd;
                        break;
                }
            }
            n--;
        }
    }
    public void traverse() {
        Node temp = head;
        if (head == null){
            System.out.println("LL does not exist");
        }
        else{
            while (temp!=null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList b = new LinkedList();
        b.Insertion();
        b.traverse();
    }
}
