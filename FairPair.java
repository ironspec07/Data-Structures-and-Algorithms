import java.util.*;
public class FairPair {
    private static int fairPair(int[] nums , int lower , int upper){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                System.out.println(i+" "+j);
                int sum = nums[i]+nums[j];
                if (sum >= lower && sum <= upper) {
                    count++;
                }
            }
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
        int lower = sc.nextInt();
        int upper = sc.nextInt();
        int ans = fairPair(arr,lower,upper);
        System.out.println(ans);
        sc.close();
    }
}