import java.util.*;
public class aPlusB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int k = 0; k < t; k++) {
            String str = sc.nextLine();
            int index = -1;
            for (int i = 0 ; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == '+') {
                    index = i;
                } 
            }
            int a = Integer.parseInt(str.substring(0, index));
            int b = Integer.parseInt(str.substring(index+1));
            int ans = a+b;
            System.out.println(ans);
        }
        sc.close();
    }
}
