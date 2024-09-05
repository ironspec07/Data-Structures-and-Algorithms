import java.util.Scanner;

public class Katryoshka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(); // number of eyes
        long m = sc.nextLong(); // number of mouths
        long k = sc.nextLong(); // number of bodies
        
        long katryoshkas = 0;

        // First, try to form as many from 1 eye, 1 mouth, and 1 body
        long oneEyeMouthBody = Math.min(n, Math.min(m, k));
        katryoshkas += oneEyeMouthBody;
        
        // Reduce the used resources
        n -= oneEyeMouthBody;
        m -= oneEyeMouthBody;
        k -= oneEyeMouthBody;

        // Now try to form as many from 2 eyes and 1 body
        long twoEyesBody = Math.min(n / 2, k);
        katryoshkas += twoEyesBody;

        n -= twoEyesBody * 2;
        k -= twoEyesBody;

        // Now try to form as many from 2 eyes, 1 mouth, and 1 body
        long twoEyesMouthBody = Math.min(n / 2, Math.min(m, k));
        katryoshkas += twoEyesMouthBody;

        System.out.println(katryoshkas);
        sc.close();
    }
}
