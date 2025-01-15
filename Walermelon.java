import java.util.*;
public class Walermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int count = 0;
        for (int i = 2; i < w; i += 2) {
            for (int j = 2; j < w; j += 2) {
                if (i+j == w) {
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
        sc.close();
    }
}
