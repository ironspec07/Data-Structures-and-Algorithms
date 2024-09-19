import java.util.*;
public class LetsUseGetLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int a = str.indexOf('\\');
        System.out.println(str.substring(0, a));
        sc.close();
    }
}
