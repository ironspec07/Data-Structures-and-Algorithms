import java.util.*;

class ModifiedDeletion {
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

    public static void deleteNode(Node node) {
        // Node temp = head;
        // while (temp.next!=node) {
        //     temp = temp.next;
        // }
        // temp.next.data = temp.next.next.data;
        // temp.next = temp.next.next;
        node.data=node.next.data;
        node.next=node.next.next;
    }

    public static Node findNode(Node head, int value) {
        Node temp = head;
        while (temp != null && temp.data != value) {
            temp = temp.next;
        }
        return temp;
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

            int x = sc.nextInt();
            Node nodeToDelete = findNode(head, x);
            if (nodeToDelete != null && nodeToDelete.next != null) {
                deleteNode(nodeToDelete);
            }
        }

        sc.close();
        printList(head);
    }
}

