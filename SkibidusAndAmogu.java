import java.util.*;
public class SkibidusAndAmogu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0;i < t;i++){
            String str = sc.nextLine();
            int len = str.length();
            if (len < 2) {
                System.out.println("i");
            }
            else{
                String s = str.substring(0,len-2);
                System.out.println(s+"i");
            }
        }
        sc.close();
    }
}
