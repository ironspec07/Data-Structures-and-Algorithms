import java.util.*;
public class SkibidusAndOhio {
    public static int minLength(String s){
        Stack<Character> stack = new Stack<>();
        if (s.length() == 2 && (s.charAt(0)==s.charAt(1))) {
            return 1;
        }
        else{
            for (char ch : s.toCharArray()) {
                if (!stack.isEmpty() && stack.peek() == ch) {
                    stack.pop();
                } else {
                    stack.push(ch); 
                }
            }
        }
        
        return stack.size();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0;i < t;i++){
            String str = sc.nextLine();
            System.out.println(minLength(str));
        }
        sc.close();
    }
}
