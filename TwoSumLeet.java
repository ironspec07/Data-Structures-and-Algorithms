import java.util.*;

public class TwoSumLeet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] number = new int[n];
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] result = new int[2];
        int left = 0;
        int right = number.length - 1;
        while (left < right) {
            int sum = number[left] + number[right];
            if (sum == target) {
                result[0] = left+1;
                result[1] = right+1;
                break;
            } 
            else if (sum < target) {
                left++;
            } 
            else {
                right--;
            }
        }
        System.out.println(Arrays.toString(result));
        sc.close();
    }
}


