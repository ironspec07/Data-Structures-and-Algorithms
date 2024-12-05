import java.util.Scanner;
import java.util.Stack;

public class RemoveAdjacentDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack <Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (st.size()==0 || st.peek()!=str.charAt(i)) {
                st.push(str.charAt(i));
            }
            else{
                st.pop();
            }
        }
        String temp = "";
        while (st.size()!=0) {
            temp = st.pop() + temp;
        }
        System.out.println(temp);
        sc.close();
    }
}
