// leetcode - 1518.

import java.util.*;
public class WaterBottle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fb = sc.nextInt();
        int eb = sc.nextInt();
        int ans = fb;
        while (fb>=eb) {
            int nb = fb/eb; // finds the number of new filled bottles.
            int rb = fb%eb; // finds the number of remaning empty bottles after exchange.

            ans += nb; //adds new filled bottles to answer.

            fb = nb+rb; // updates the number of filled bottles.
        }
        System.out.println(ans);
        sc.close();
    }
}