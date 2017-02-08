/**
 * @author Ievgenii Drozd
 * @version 2/8/17
 *          Day 14: Scope
 */
public class Difference {
    private int[] elements;
    private int maximumDifference = 0;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {
        int abs = 0;
        for (int element : elements) {
            for (int element1 : elements) {
                abs = Math.abs(element - element1);
                if (abs > maximumDifference) {
                    this.maximumDifference = abs;
                }
            }
        }
    }
}
