import java.util.*;
public class MaxSumOfPair {
    private static int sumDigits(int num){
        int sum = 0;
        while (num > 0) {
            int ld = num%10;
            sum = sum + ld;
            num = num/10;
        }
        return sum;
    }
    private static int maxPairSum(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        int max = -1;
        for (int num : nums) {
            int digitSum = sumDigits(num);
            if (map.containsKey(digitSum)) {
                max = Math.max(max, num + map.get(digitSum));
            }
            map.put(digitSum, Math.max(map.getOrDefault(digitSum, 0), num));
        }

        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = maxPairSum(arr);
        System.out.println(ans);
        sc.close();
    }
}
