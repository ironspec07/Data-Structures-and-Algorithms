import java.util.*;
public class ToLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch>=65 && ch<= 90) {
                int a = (int)ch;
                a=a+32;
                str += (char)a;
            }
            else{
                str += ch;
            }
        }
        // s = s.toLowerCase();
        System.out.println(str);
        sc.close();
    }
}
