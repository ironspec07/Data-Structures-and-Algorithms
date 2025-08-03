import java.util.*;
public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        PriorityQueue<Character> pq = new PriorityQueue<>();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != '+') {
                pq.add(ch[i]);
            }
        }
        while(pq.size() != 0) {
            System.out.print(pq.remove());
            if (pq.size() > 0) {
                System.out.print("+");
            }
        }
        sc.close();
    }
}
