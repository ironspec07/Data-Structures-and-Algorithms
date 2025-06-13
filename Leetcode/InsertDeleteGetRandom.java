import java.util.*;;
public class InsertDeleteGetRandom {
    static HashMap<Integer,Integer> hm = new HashMap<>();
    static ArrayList<Integer> ls = new ArrayList<>();
    static Random r = new Random();
    public static boolean insert(int val){
        if (hm.containsKey(val) == true) {
            return false;
        }
        else{
            hm.put(val, ls.size());
            ls.add(val);
            return true;
        }
    }
    public static boolean remove(int val){
        if (hm.containsKey(val) == false) {
            return false;
        }
        int idx = hm.get(val);
        hm.remove(val);
        if (idx == ls.size()-1) {
            ls.remove(ls.size()-1);
            return true;
        }
        int lastIdx = ls.size()-1;
        int temp = ls.get(lastIdx);
        Collections.swap(ls, idx, lastIdx);
        ls.remove(lastIdx);
        hm.put(temp, idx);
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
