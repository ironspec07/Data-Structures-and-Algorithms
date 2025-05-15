package Hashmap;
import java.util.*;
public class RabbitsInForest {
    private static int minRabbit(int[] answers){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < answers.length; i++) {
            if (hm.containsKey(answers[i]) == false) {
                hm.put(answers[i], 1);
            }
            else{
                int temp = hm.get(answers[i]);
                hm.put(answers[i], temp+1);
            }
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            int k = entry.getKey();
            int v = entry.getValue();
            int groupSize = k + 1;
            int groups = (v + k) / groupSize;
            count += groups * groupSize;
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = minRabbit(arr);
        System.out.println(ans);
        sc.close();
    }
}
