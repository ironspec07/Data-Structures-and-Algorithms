import java.util.*;
public class FindWordsContainingCharacters {
    private static List<Integer> findWords(String[] words , char x){
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                ans.add(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] words = new String[n];
        for (int i = 0; i < words.length; i++) {
            words[i] = sc.nextLine();
        }
        char x = sc.nextLine().charAt(0);
        List<Integer> ans = findWords(words,x);
        System.out.println(ans);
        sc.close();
    }
}
