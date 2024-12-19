import java.util.*;
public class WonderfulNumber {
    public static boolean odd(int n){
        if (n%2==0) {
            return false;
        }
        else{
            return true;
        }
    }
    public static boolean palindrome(String str){
        int s = 0;
        int e = str.length()-1;
        while (s<e) {
            if (str.charAt(s)!=str.charAt(e)) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = Integer.toBinaryString(n);
        boolean od = odd(n);
        boolean palin = palindrome(str);
        if (od && palin) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}
