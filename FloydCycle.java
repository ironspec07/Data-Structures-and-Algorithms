// Lab Template

import java.util.*;

class FloydCycle {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static Node head;

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

    public static Node detectCycle(Node head) {
        Node slow = head;
        Node fast = head;
        
        while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;

        if (slow == fast) {
            
            slow = head;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow; 
        }
    }

    return null; 
}

    public static void createCycle(Node head, int pos) {
        if (pos == -1) return;

        Node temp = head;
        Node cycleNode = null;
        int index = 0;
        while (temp.next != null) {
            if (index == pos) {
                cycleNode = temp;
            }
            temp = temp.next;
            index++;
        }
        temp.next = cycleNode;
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
            int pos = sc.nextInt();
            createCycle(head, pos);
        }

        sc.close();

        Node cycleNode = detectCycle(head);
        if (cycleNode != null) {
            System.out.println(cycleNode.data);
        } else {
            System.out.println("null");
        }
    }
}
