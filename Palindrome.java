import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = n;
        int rev = 0;
        while (t%10==0 && t!=0) {
            t=t/10;
        }
        while (t!=0) {
            int ld = t%10;
            rev = rev*10+ld;
            t = t/10;
        }
        System.out.println(rev);
        t=n;
        rev = 0;
        while (t!=0) {
            int ld = t%10;
            rev = rev*10+ld;
            t = t/10;
        }
        if (rev==n) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}

