import java.util.*;
public class InsertDeleteGetRandomDuplicates {
    static HashMap<Integer,HashSet<Integer>> hm = new HashMap<>();
    static ArrayList<Integer> ls = new ArrayList<>();
    static Random r = new Random();
    public static boolean insert(int val){
        HashSet<Integer> set = new HashSet<>();
        boolean flag;
        if (hm.containsKey(val) == true) {
            set = hm.get(val);
            flag = false;
        }
        else{
            set = new HashSet<>();
            flag = true;
        }
        set.add(ls.size());
        hm.put(val, set);
        ls.add(val);
        return flag;
    }
    public static boolean remove(int val){
        HashSet<Integer> set = new HashSet<>();
        if (hm.containsKey(val) == true) {
            set = hm.get(val);
        }
        else{
            return false;
        }
        int remIdx = -1;
        for (int x : set) {
            remIdx = x;
            break;
        }
        set.remove(remIdx);
        hm.put(val, set);
        if (remIdx == ls.size()-1) {
            ls.remove(ls.size()-1);
        }
        else{
            int lastIdx = ls.size()-1;
            int temp = ls.get(lastIdx);
            Collections.swap(ls, remIdx, lastIdx);
            ls.remove(lastIdx);
            HashSet<Integer> s = hm.get(temp);
            s.remove(lastIdx);
            s.add(remIdx);
            hm.put(temp, s);
        }
        if (hm.get(val).size() == 0) {
            hm.remove(val);
        }
        return true;
    }
    public static int getRandom(){
        int idx = r.nextInt(ls.size());
        return ls.get(idx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < q; i++) {
            String str = sc.nextLine().trim();
            if (str.startsWith("insert ")) {
                int val = Integer.parseInt(str.substring(7));
                System.out.println(insert(val));
            } else if (str.startsWith("remove ")) {
                int val = Integer.parseInt(str.substring(7));
                System.out.println(remove(val));
            } else if (str.equals("getRandom")) {
                System.out.println(getRandom());
            }
        }
        sc.close();
    }
}
