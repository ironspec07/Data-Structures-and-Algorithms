import java.util.*;
public class PairSumOptimal {
    public static boolean  pairSum(int[] arr, int k){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])==false) {
                hm.put(arr[i], 1);
            }
            else{
                int temp = hm.get(arr[i]);
                hm.put(arr[i], temp+1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            int b = k-a;
            if (a!=b && hm.containsKey(b)==true) {
                return true;
            }
            else if (a==b && hm.get(b)>=2) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        if (pairSum(arr, k)==true) {
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }
        sc.close();
    }
}
