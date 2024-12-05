import java.util.*;

class MiddleOfLinkedList{
    static class Node {
        int data;
        Node next;
    
        Node(int d) {
            data = d;
            next = null;
        }
    }

    static Node head;

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void addToTheLast(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }

    public static Node middleNode(Node node) {
        Node s = head;
        Node f = head;
        while (f.next!=null && f.next.next!=null) {
            s=s.next;
            f=f.next.next;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n > 0) {
            int a1 = sc.nextInt();
            head = new Node(a1);
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                addToTheLast(new Node(a));
            }
        }

        sc.close();

        Node midNode = middleNode(head);
        if (midNode != null) {
            System.out.println(midNode.data);
        }
    }
}

