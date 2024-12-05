import java.util.*;

class ReverseLinkedList {
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

    public static Node reverseList(Node head) {
        Node curr = head;
        Node prev = null;
        while (curr!=null) {
            Node currP1 = curr.next;
            curr.next=prev;
            prev=curr;
            curr=currP1;
        }
        head = prev;
        return head;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n > 0) {
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            addToTheLast(head);
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                addToTheLast(new Node(a));
            }
        }

    
        sc.close();

        Node reversedHead = reverseList(head);
        printList(reversedHead);
    }
}

