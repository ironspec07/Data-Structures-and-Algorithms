import java.util.*;
public class StringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch =='e' || ch =='i' || ch =='o' || ch =='y' || ch =='u') {
                continue;
            }
            else if (ch == 'A' || ch =='E' || ch =='I' || ch =='O' || ch =='U' || ch =='Y') {
                continue;
            }
            else{
                System.out.print("."+Character.toLowerCase(ch));
            }
        }
        sc.close();
    }
}
