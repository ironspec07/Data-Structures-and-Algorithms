import java.util.Scanner;

public class Prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        int count = 0;
        for(int i = 1; i*i<= n;i++){
            if(n%i==0){
                if(i==n/i){
                    count++;
                }
                else{
                    count = count + 2;
                }
            }
        }
        if(count==2){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}
