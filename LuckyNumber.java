import java.util.*;
public class LuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int ld = a%10;
        int fd = a/10;
        if (ld!=0 && fd!=0) {
            if (fd%ld==0 || ld%fd==0) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        else if (fd!=0 && ld%fd==0) {
            System.out.println("YES");
        }
        sc.close();
    }
}
