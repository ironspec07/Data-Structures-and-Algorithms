//Leetcode - 1910
import java.util.*;
public class RemovveAllOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String part = sc.nextLine();
        while (s.contains(part)) {
            s = s.replaceFirst(part, "");
        }
        System.out.println(s);
        sc.close();
    }
}
/*
StringBuilder sb = new StringBuilder(s);
while(sb.indexOf(part) != -1) {
    int idx = sb.indexOf(part);
    sb.delete(idx, idx + part.length());
}
return sb.toString();
 */