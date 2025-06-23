import java.util.*;
public class BookAllocation {
    public static int calculate(int[] pages, int m){
        int studentCount = 1;
        int sum = 0;
        for (int p : pages) {
            if (sum+p > m)  {
                studentCount++;
                sum = 0;
            }
            sum = sum+p;
        }
        return studentCount;
    }
    public static int shipWithinDays(int[] pages, int students){
        int lo = Integer.MIN_VALUE;
        int hi = 0;
        for (int i = 0; i < pages.length; i++) {
            lo = Math.max(lo, pages[i]);
            hi = hi+pages[i];
        }
        int ans = 0;
        while (lo <= hi) {
            int m = lo+(hi-lo)/2;
            int reqStudents = calculate(pages,m);
            if (reqStudents <= students) {
                ans = m;
                hi = m-1;
            }
            else{
                lo = m+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int students = sc.nextInt();
        int[] pages = new int[n];
        for (int i = 0; i < pages.length; i++) {
            pages[i] = sc.nextInt();
        }
        int ans = shipWithinDays(pages,students);
        System.out.println(ans);
        sc.close();
    }
}
