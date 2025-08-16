import java.util.*;
public class Maximum69Number {
    public static int maximum69Number (int num) {
        if (num == 9|| num == 99 || num == 999 || num == 9999) {
            return num;
        }
        String numString = ""+num;
        int n = numString.length();
        int[] numArr = new int[n];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = numString.charAt(i) - '0';
        }
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] == 6) {
                numArr[i] = 9;
                break;
            }
        }
        int ans = 0;
        for (int i = 0; i < numArr.length; i++) {
            ans = ans*10 + numArr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = maximum69Number(num);
        System.out.println(ans);
        sc.close();
    }
}
