    import java.util.Scanner;

    public class FactorialRecursion {
        public static int fact = 1;
        public static long factorial(int n){
            if (n==0) {
                return 1;
            }
            
            return n*factorial(n-1);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            long fact = factorial(n);
            System.out.println(fact);
            sc.close();
        }
    }
