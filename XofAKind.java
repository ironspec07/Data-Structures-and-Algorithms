import java.util.*;
public class XofAKind {
    private static int gcd(int a , int b){
        if (a==0) {
            return b;
        }
        int temp = gcd(b%a,a);
        return temp;
    }
    private static boolean xOfaKind(int[] deck){
        HashMap<Integer,Integer> hm = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < deck.length; i++) {
            if (hm.containsKey(deck[i]) == false) {
                hm.put(deck[i], 1);
            }
            else{
                int temp = hm.get(deck[i]);
                hm.put(deck[i], temp+1);
            }
        }
        for(int key :  hm.keySet()){
            ans = gcd(ans, hm.get(key));
        }
        if (ans == 1) {
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        boolean ans = xOfaKind(arr);
        System.out.println(ans);
        sc.close();
    }
}
