import java.util.*;
public class CheckPalin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;
        while (temp != 0) {
            int ld = temp%10;
            rev = rev*10 +ld;
            temp = temp/10;
        }
        if (num == rev) {
            System.out.println(num+" is a palindrome");
        }
        else{
            System.out.println(num+" is not a palindrome");
        }
        sc.close();
    }
}
