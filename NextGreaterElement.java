import java.util.*;
public class NextGreaterElement {
    public static int nextGreatEle(int n){
        char[] num = (n+"").toCharArray();
        int idex = -1;
        for (int i = num.length-2; i >= 0; i--) {
            if (num[i]<num[i+1]) {
                idex = i;
                break;
            }
        }
        if (idex == -1) {
            return -1;
        }
        char val = num[idex];
        int smallestIdex = idex+1;
        for (int i = idex+1; i < num.length; i++) {
            if (num[i]>val && num[i] <= num[smallestIdex]) {
                smallestIdex = i;
            }
        }
        char temp = num[idex];
        num[idex] = num[smallestIdex];
        num[smallestIdex] = temp;
        Arrays.sort(num,idex+1,num.length);
        long ans = Long.parseLong(new String(num));
        if (ans > Integer.MAX_VALUE) {
            return -1;
        }
        else {
            return (int)ans;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(nextGreatEle(n));
        sc.close();
    }
}
