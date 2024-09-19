import java.util.*;
public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0;i<t;i++) {
            String str = sc.nextLine();
            int l = str.length();
            if (l<10) {
                System.out.println(str);
            }
            else{
                System.out.print(str.charAt(0));
                System.out.print(l-2);
                System.out.println(str.charAt(l-1));
            }
        }
        sc.close();
    }
}
