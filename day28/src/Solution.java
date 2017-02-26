import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author Ievgenii Drozd
 * @version 2/26/17
 *          Day 28: RegEx, Patterns, and Intro to Databases
 */
public class Solution {
    private static final String EMAIL_REGEX = ".*@gmail.com$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Email[] emails = new Email[N];
        for (int i = 0; i < emails.length; i++) {
            String firstName = sc.next();
            String emailId = sc.next();
            emails[i] = new Email(firstName, emailId);
        }

        Arrays.stream(emails).filter(email -> email.emailId.matches(EMAIL_REGEX))
                .sorted(Comparator.comparing(email2 -> email2.firstName))
                .forEach(email -> System.out.println(email.firstName));
    }
}
