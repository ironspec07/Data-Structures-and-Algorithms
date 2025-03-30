import java.util.*;
public class ReverseDegreeOfAString {
    private static int degree(String s){
        int n = s.length();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int revIndex = 26-(ch-'a');
            sum = sum + (revIndex*(i+1));
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int ans = degree(str);
        System.out.println(ans);
        sc.close();
    }
}