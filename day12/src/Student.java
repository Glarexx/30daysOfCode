/**
 * @author Ievgenii Drozd
 * @version 1/25/17
 *          Day 12: Inheritance
 */
public class Student extends Person {
    private int[] testScores;

    public Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }

    public char calculate() {
        int sum = 0;
        for (int i : testScores) {
            sum += i;

        }
        double average = sum / testScores.length;
        if (average >= 90 && average <= 100) return 'O';
        if (average >= 80 && average < 90) return 'E';
        if (average >= 70 && average < 80) return 'A';
        if (average >= 55 && average < 70) return 'P';
        if (average >= 40 && average < 55) return 'D';
        return 'T';
    }

    public int[] getTestScores() {
        return testScores;
    }

    public void setTestScores(int[] testScores) {
        this.testScores = testScores;
    }
}
