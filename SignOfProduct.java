import java.util.*;
public class SignOfProduct {
    public static int signFunc(int product){
        if (product>0) {
            return 1;
        }
        else if (product<0) {
            return -1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            product *= nums[i];
        }
        System.out.println(signFunc(product));
        sc.close();
    }
}
