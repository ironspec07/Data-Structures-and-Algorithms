import java.util.*;
public class LengthOfLatWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.trim();
        
        int n = s.length();
        int count = 0;
        for(int i = n-1; i >= 0; i--){
            if (s.charAt(i) == ' ') {
                break;
            }
            count++;
        } 
        System.out.println(count);
        sc.close();
    }
}
