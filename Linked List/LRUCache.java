import java.util.HashMap;

public class LRUCache {
    class Node{
        int key;
        int val;
        Node prev;
        Node next;
    }
    HashMap<Integer,Node> hm;
    Node H = new Node();
    Node T = new Node();
    int cap;
    public LRUCache(int capacity) {
        cap = capacity;
        H.next = T;
        T.prev = H;
        hm = new HashMap<>();
    }
    public Node delete(Node head,Node d){
        Node dm1 = d.prev;
        Node dp1 = d.next;
        dm1.next = dp1;
        dp1.prev = dm1;
        d.next = null;
        d.prev = null;
        return d;
    }
    public void add(Node H,Node T,Node n1){
        Node tm1 = T.prev;
        tm1.next = n1;
        n1.next = T;
        T.prev = n1;
        n1.prev = tm1;
    }
    public int get(int key) {
        if (hm.containsKey(key)==false) {
            return -1;
        }
        else{
            int ans = hm.get(key).val;
            Node temp = delete(H, hm.get(key));
            add(H, T, temp);
            return ans;
        }
    }
    
    public void put(int key, int value) {
        Node res = hm.get(key);
        if (res == null) {
            if (hm.size() == cap) {
                hm.remove(H.next.key);
                delete(H, H.next);
            }
            Node n1 = new Node();
            n1.key = key;
            n1.val = value;
            hm.put(key, n1);
            add(H, T, n1);
        }
        else{
            Node temp = delete(H, res);
            temp.val = value;
            hm.put(key, temp);
            add(H, T, temp);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */