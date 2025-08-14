import java.util.*;
public class Largest3SameDigitNum {
    public static String largestGoodInteger(String num) {
        // int n = num.length();
        // int ans = 0;
        // boolean change = false;
        // for (int i = 0; i < n-2; i++) {
        //     char c1 = num.charAt(i);
        //     char c2 = num.charAt(i+1);
        //     char c3 = num.charAt(i+2);
        //     if (c1 != c2 || c2 != c3 || c3 != c1) {
        //         continue;
        //     }
        //     else{
        //         ans = Math.max(ans, Integer.parseInt(""+c1+c2+c3));
        //         change = true;
        //     }
        // }
        // if (change) {
        //     if (ans == 0) {
        //         return "000";
        //     }
        //     return ""+ans;
        // }
        // else return "";
        String[] number = {"999","888","777","666","555","444","333","222","111","000"};
        for (String n : number) {
            if (num.contains(n)) {
                return n;
            }
        }
        return "";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String ans = largestGoodInteger(num);
        System.out.println(ans);
        sc.close();
    }
}
