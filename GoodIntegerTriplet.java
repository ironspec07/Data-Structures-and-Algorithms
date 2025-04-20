import java.util.*;
public class GoodIntegerTriplet {
    private static int goodInt(int[] arr ,int a,int b,int c){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if ((Math.abs(arr[i] - arr[j]) <= a) && (Math.abs(arr[j] - arr[k]) <= b) && (Math.abs(arr[i] - arr[k]) <= c)) {
                        count++;
                    }
                }
            }
        }
        return count;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int count = goodInt(arr,a,b,c);
        System.out.println(count);
        sc.close();
    }
}