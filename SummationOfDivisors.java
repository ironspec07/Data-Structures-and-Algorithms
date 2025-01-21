    import java.util.Scanner;

    public class SummationOfDivisors {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            long n = sc.nextLong();
            long sum = 0;

        for(int i=1;i<=Math.sqrt(n);i++){
            if(n % i == 0){
                sum += i;
                if(i != Math.sqrt(n)){
                    sum+=n/i;
                }
            }
        }

            System.out.println(sum);
            sc.close();
        }
    }
