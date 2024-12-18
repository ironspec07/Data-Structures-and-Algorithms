import java.util.*;
public class Average {
    public static double avg(double sum , int n){
        double av = sum/n;
        return av;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }
        double result = avg(sum,n);
        System.out.format("%.7f", result);
        sc.close();
    }
    
}