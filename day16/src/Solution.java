import java.util.Scanner;

/**
 * @author Ievgenii Drozd
 * @version 2/20/17
 *          Day 16: Exceptions - String to Integer
 */
public class Solution {
    public static void main(String[] args) {
        try {
            System.out.println(Integer.valueOf(new Scanner(System.in).next()));
        } catch (Exception e) {
            System.out.println("Bad String");
        }
    }
}
