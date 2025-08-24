import java.util.*;
public class RedStone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            HashMap<Integer,Integer> hm = new HashMap<>();
            for (int i = 0; i < arr.length; i++) {
                hm.put(arr[i],hm.getOrDefault(arr[i], 0)+1);
            }
            boolean flag = false;
            for (Integer i : hm.keySet()) {
                if (hm.get(i) >= 2) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        sc.close();
    }
}
