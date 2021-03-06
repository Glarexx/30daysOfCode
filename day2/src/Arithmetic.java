import java.util.Scanner;

/**
 * @author Ievgenii Drozd
 * @version 1/15/17
 *          Day 2: Operators
 */

public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(mealCost + (mealCost * tipPercent / 100) + (mealCost * taxPercent / 100));

        // Print your result
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
}