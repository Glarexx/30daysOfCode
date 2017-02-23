/**
 * @author Ievgenii Drozd
 * @version 2/23/17
 *          Day 19: Interfaces
 */
public class Calculator implements AdvancedArithmetic {
    @Override
    public int divisorSum(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                result += i;
            }
        }
        return result;
    }
}