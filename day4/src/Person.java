import java.io.*;
import java.util.*;

/**
 * @author Ievgenii Drozd
 * @version 1/17/17
 *          Day 4: Class vs. Instance
 */

public class Person {
    private static final String AGE_IS_NOT_VALID_SETTING_AGE_TO_0 = "Age is not valid, setting age to 0.";
    private static final String YOU_ARE_YOUNG = "You are young.";
    private static final String YOU_ARE_A_TEENAGER = "You are a teenager.";
    private static final String YOU_ARE_OLD = "You are old.";

    private int age;

    private Person(int initialAge) {
        if (initialAge < 0) {
            this.age = 0;
            System.out.println(AGE_IS_NOT_VALID_SETTING_AGE_TO_0);
        } else {
            this.age = initialAge;
        }
    }

    private void amIOld() {
        if (this.age < 13) {
            System.out.println(YOU_ARE_YOUNG);
        } else {
            if (this.age >= 13 && this.age < 18) {
                System.out.println(YOU_ARE_A_TEENAGER);
            } else {
                System.out.println(YOU_ARE_OLD);
            }
        }
    }

    private void yearPasses() {
        this.age++;
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