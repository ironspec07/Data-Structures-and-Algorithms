import java.util.*;
public class CountVowels {
    public static int count(String str , int index){
        if (index == str.length()) {
            return 0;
        }
        if (str.charAt(index)=='a'||str.charAt(index)=='e'||str.charAt(index)=='i'||str.charAt(index)=='o'||str.charAt(index)=='u') {
            return 1+count(str, index+1);
        }
        else{
            return count(str, index+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        System.out.println(count(str, 0));
        sc.close();
    }
}
