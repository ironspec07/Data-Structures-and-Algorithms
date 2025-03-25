import java.util.*;
public class DaysWithoutMeeting {
    private static int freeDays(int[][] meetings , int days){
        int[] num = new int[days+1];
        num[0] = 1;
        for (int i = 0; i < meetings.length; i++) {
            int start = meetings[i][0];
            int end = meetings[i][1];
            for (int j = start; j <= end; j++) {
                num[j] = 1;
            }
        }
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] !=1) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int day = sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int ans = freeDays(arr , day);
        System.out.println(ans);
        sc.close();
    }
}
