import java.util.Scanner;

/**
 * @author Ievgenii Drozd
 * @version 1/23/17
 *          Day 9: Recursion
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(factorial(new Scanner(System.in).nextInt()));
    }

    private static int factorial(int i) {
        if (i == 0) return 1;
        return i * factorial(i - 1);
    }
}