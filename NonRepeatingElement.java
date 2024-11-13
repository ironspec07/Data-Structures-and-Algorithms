import java.util.*;
public class NonRepeatingElement {
    public static int nonRep(int[] arr){
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
            if (hm.get(arr[i])==1) {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(nonRep(arr));
        sc.close();
    }
}
