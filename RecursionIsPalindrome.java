import java.util.Scanner;

public class RecursionIsPalindrome {
    public static boolean palin(char[] ch,int sp ,int ep){
        if (sp==ep) {
            return true;
        }
        if (sp>ep) {
            return true;
        }
        if (ch[sp]!=ch[ep]) {
            return false;
        }
        else{
            boolean temp = palin(ch,sp+1,ep-1);
            return temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        char[] ch = str.toCharArray();
        int sp = 0;
        int ep = ch.length-1;
        System.out.println(palin(ch,sp,ep));
        sc.close();
    }
}
