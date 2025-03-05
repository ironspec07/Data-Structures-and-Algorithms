import java.util.*;

public class CountSuccessorPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        
        int temp = 0;
        int result = 0;
        int counter = 0;
        
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                temp = arr[i];
                result = 1;
            } else {
                if (temp == arr[i]) {
                    result++;
                } else if (temp + 1 == arr[i]) {
                    counter += result;
                    temp = arr[i];
                    result = 1;
                } else {
                    result = 1;
                    temp = arr[i];
                }
            }
        }
        
        System.out.println(counter);
        sc.close();
    }
}
