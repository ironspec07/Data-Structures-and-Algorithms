import java.util.*;

class MyHashMap {
    HashMap<Integer,Integer> hm;
    public MyHashMap() {
        hm = new HashMap<>();
    }
    
    public void put(int key, int value) {
        hm.put(key, value); 
    }
    
    public int get(int key) {
        if (hm.containsKey(key)) {
            return hm.get(key);
        }
        return -1;
    }
    
    public void remove(int key) {
        hm.remove(key);
    }
}