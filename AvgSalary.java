import java.util.*;
public class AvgSalary {
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    public static int sumation(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] salary = new int[n];
        for (int i = 0; i < salary.length; i++) {
            salary[i] = sc.nextInt();
        }
        int max = findMax(salary);
        int min = findMin(salary);
        int sum = sumation(salary)-min-max;
        double m = salary.length-2.0;
        double avg = sum/m;
        System.out.println(avg);
        sc.close();
    }
}
