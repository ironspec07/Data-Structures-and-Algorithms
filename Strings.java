import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String T = sc.nextLine();
        System.out.println(S.length()+" "+T.length());
        System.out.println(S+T);
        System.out.println(T.charAt(0)+S.substring(1)+" "+S.charAt(0)+T.substring(1));
        sc.close();
    }
}

