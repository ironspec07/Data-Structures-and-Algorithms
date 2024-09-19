import java.util.*;
public class CreateANewString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String T = sc.nextLine();
        System.out.println(S.length()+" "+T.length());
        System.out.println(S+" "+T);
        sc.close();
    }
}