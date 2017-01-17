import java.io.*;
import java.util.*;

/**
 * @author Ievgenii Drozd
 * @version 1/17/17
 *          Day 4: Class vs. Instance
 */

public class Person {
    private int age;

    private Person(int initialAge) {
        if (initialAge < 0) {
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        } else {
            this.age = initialAge;
        }
    }

    private void amIOld() {
        if (this.age < 13) {
            System.out.println("You are young.");
        } else {
            if (this.age >= 13 && this.age < 18) {
                System.out.println("You are a teenager.");
            } else {
                System.out.println("You are old.");
            }
        }
    }

    private void yearPasses() {
        age++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}