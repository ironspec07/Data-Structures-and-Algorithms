import java.util.*;

public class LetterCombinationOfPhone {
    public static List<String> letterCombinations(String digits) {
        int strLen = digits.length();
        if (strLen == 0) {
            return new ArrayList<>();
        }
        HashMap<Character, String> hm = new HashMap<>();
        hm.put('2', "abc");
        hm.put('3', "def");
        hm.put('4', "ghi");
        hm.put('5', "jkl");
        hm.put('6', "mno");
        hm.put('7', "pqrs");
        hm.put('8', "tuv");
        hm.put('9', "wxyz");
        ArrayList<String> ans = new ArrayList<>();
        if (strLen == 1) {
            String str = hm.get(digits.charAt(0));
            for (int i = 0; i < str.length(); i++) {
                ans.add("" + str.charAt(i));
            }
            return ans;
        } else if (strLen == 2) {
            String a = hm.get(digits.charAt(0));
            String b = hm.get(digits.charAt(1));
            for (int i = 0; i < a.length(); i++) {
                char ch1 = a.charAt(i);
                for (int j = 0; j < b.length(); j++) {
                    char ch2 = b.charAt(j);
                    ans.add("" + ch1 + ch2);
                }
            }
            return ans;
        }
        else if (strLen == 3) {
            String a = hm.get(digits.charAt(0));
            String b = hm.get(digits.charAt(1));
            String c = hm.get(digits.charAt(2));
            for (int i = 0; i < a.length(); i++) {
                char ch1 = a.charAt(i);
                for (int j = 0; j < b.length(); j++) {
                    char ch2 = b.charAt(j);
                    for (int k = 0; k < c.length(); k++) {
                        char ch3 = c.charAt(k);
                        ans.add("" + ch1 + ch2+ch3);
                    }
                }
            }
            return ans;
        }
        else{
            String a = hm.get(digits.charAt(0));
            String b = hm.get(digits.charAt(1));
            String c = hm.get(digits.charAt(2));
            String d = hm.get(digits.charAt(3));
            for (int i = 0; i < a.length(); i++) {
                char ch1 = a.charAt(i);
                for (int j = 0; j < b.length(); j++) {
                    char ch2 = b.charAt(j);
                    for (int k = 0; k < c.length(); k++) {
                        char ch3 = c.charAt(k);
                        for (int l = 0; l < d.length(); l++) {
                            char ch4 = d.charAt(l);
                            ans.add("" + ch1 + ch2+ch3+ch4);
                        }
                    }
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        List<String> ans = letterCombinations(str);
        for (String a : ans) {
            System.out.print(a+" ");
        }
        sc.close();
    }
}
