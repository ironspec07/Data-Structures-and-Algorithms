import java.util.*;
public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int ans = str1.compareToIgnoreCase(str2);
        if (ans == 0) {
            System.out.println(0);
        }
        else if (ans < 0) {
            System.out.println(-1);
        }
        else{
            System.out.println(1);
        }
        sc.close();
    }
}
