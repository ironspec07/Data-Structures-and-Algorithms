import java.util.*;
public class ContainerWithMostWater {
    private static int maxWater(int[] height){
        int i = 0;
        int j = height.length-1;
        int ans = Integer.MIN_VALUE;
        while (i<j) {
            int w = (j-i) * Math.min(height[i], height[j]);
            ans = Math.max(ans, w);
            if (height[i] <= height[j]) {
                i++;
            }
            else{
                j--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = maxWater(arr);
        System.out.println(ans);
        sc.close();
    }
}
