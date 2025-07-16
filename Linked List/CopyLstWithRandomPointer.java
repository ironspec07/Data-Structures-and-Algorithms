class Solution {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int value) {
            val = value;
        }
    }

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        Node temp = head;
        while (temp != null) {
            Node n1 = new Node(temp.val);
            Node tempp1 = temp.next;
            temp.next = n1;
            n1.next = tempp1;
            temp = tempp1;
        }
        Node t = head;
        while (t != null) {
            if (t.random != null) {
                t.next.random = t.random.next;
            }
            t = t.next.next;
        }
        Node h2 = head.next;
        Node t1 = head;
        Node t2 = head.next;
        while (t1 != null && t2 != null) {
            Node t1p1 = t1.next != null ? t1.next.next : null;
            Node t2p1 = t2.next != null ? t2.next.next : null;
            t1.next = t1p1;
            t2.next = t2p1;
            t1 = t1p1;
            t2 = t2p1;
        }
        return h2;
    }
}
