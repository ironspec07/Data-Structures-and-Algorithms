import java.util.*;
public class SaperateCharacter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<Character> charac = new ArrayList<>();
        ArrayList<Character> num = new ArrayList<>();
        ArrayList<Character> sp = new ArrayList<>();
        int coutChar = 0;
        int countNum = 0;
        int countSp = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isAlphabetic(ch)) {
                charac.add(ch);
                coutChar++;
            }
            else if (Character.isDigit(ch)) {
                num.add(ch);
                countNum++;
            }
            else{
                sp.add(ch);
                countSp++;
            }
        }
        System.out.print("Characters: ");
        for (Character ch : charac) {
            System.out.print(ch+" ");
        }
        System.out.println("(count: "+coutChar+")");
        System.out.print("Numbers: ");
        for (Character ch : num) {
            System.out.print(ch+" ");
        }
        System.out.println("(count: "+countNum+")");
        System.out.print("Special symbols: ");
        for (Character ch : sp) {
            System.out.print(ch+" ");
        }
        System.out.println("(count: "+countSp+")");
        sc.close();
    }
}
