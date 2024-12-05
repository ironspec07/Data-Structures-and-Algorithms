// Lab Template

import java.util.*;

class Node {
    int data;
    Node next;
    
    Node(int d) {
        data = d;
        next = null;
    }
}

class LinkedList_DeleteNode {
    static Node head;

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static void addToTheLast(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }

    static Node deleteNode(Node head, int x) {
        Node temp = head;
        int count = 1;
        if (x==1) {
            head = head.next;
        }
        else{
            while (count+1<x) {
                temp = temp.next;
                count++;
            }
            temp.next = temp.next.next;
        }
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

        int x = sc.nextInt();
        sc.close();

        Node result = deleteNode(head, x);
        printList(result);
    }
}

