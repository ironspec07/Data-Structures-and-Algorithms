import java.util.*;
public class CountLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        int count = 1;
        for (int i = 0; i < ch.length-1; i++) {
            if (ch[i]==ch[i+1]) {
                count++;
            }
            else{
                System.out.println(ch[i]+" : "+count);
                count = 1;
            }
        }
        System.out.println(ch[ch.length-1]+" : "+count);
        sc.close();
    }
}
