import java.util.*;

public class ArrayAnalysis {
    
    // Function to find the maximum number in the array
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Function to find the minimum number in the array
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Function to count the prime numbers in the array
    public static int countPrimes(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }

    // Function to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        int original = num, reverse = 0;
        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        return original == reverse;
    }

    // Function to count the palindrome numbers in the array
    public static int countPalindromes(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (isPalindrome(num)) {
                count++;
            }
        }
        return count;
    }

    // Function to calculate the number of divisors of a number
    public static int countDivisors(int num) {
        int divisors = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisors++;
            }
        }
        return divisors;
    }

    // Function to find the number with the maximum divisors
    public static int maxDivisors(int[] arr) {
        int maxDivisors = 0;
        int numberWithMaxDivisors = 0;
        for (int num : arr) {
            int divisors = countDivisors(num);
            if (divisors > maxDivisors || (divisors == maxDivisors && num > numberWithMaxDivisors)) {
                maxDivisors = divisors;
                numberWithMaxDivisors = num;
            }
        }
        return numberWithMaxDivisors;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("The maximum number : " + findMax(arr));
        System.out.println("The minimum number : " + findMin(arr));
        System.out.println("The number of prime numbers : " + countPrimes(arr));
        System.out.println("The number of palindrome numbers : " + countPalindromes(arr));
        System.out.println("The number that has the maximum number of divisors : " + maxDivisors(arr));
        
        sc.close();
    }
}
