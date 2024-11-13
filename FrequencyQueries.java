import java.util.*;
public class FrequencyQueries {
    
    public static void PrintFreq(int arr[] , int que[]){
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
        for (int i = 0; i < que.length; i++) {
            if (hm.containsKey(que[i])==false) {
                System.out.println("0");
            }
            else{
                System.out.println(hm.get(que[i]));
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int[] que = new int[m];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < que.length; i++) {
            que[i] = sc.nextInt();
        }
        PrintFreq(arr,que);
        sc.close();
    }
}
