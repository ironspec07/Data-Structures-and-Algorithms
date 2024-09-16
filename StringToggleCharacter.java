import java.util.*;
public class StringToggleCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] ch =  s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i]>=65 && ch[i]<=90) {
                ch[i] = (char)(ch[i]+32);
            }
            else{
                ch[i] = (char)(ch[i]-32);
            }
        }
        System.out.println(String.valueOf(ch));
        sc.close();
    }
}
