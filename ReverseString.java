import java.util.*;
public class ReverseString {
    public static void reverse(char[] ch){
        int sp = 0;
        int ep = ch.length-1;
        while (sp<ep) {
            char temp = ch[sp];
            ch[sp] = ch[ep];
            ch[ep] = temp;
            sp++;
            ep--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        reverse(ch);
        System.out.println(ch);
        sc.close();
    }
}
