import java.io.*;
import java.util.*;

/**
 * @author Ievgenii Drozd
 * @version 1/19/17
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        List<String> stringList = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            stringList.add(in.next());
            //in.nextLine();//consuming the <enter> from input above
        }

        for (String str : stringList) {
            printChars(str);
        }
    }

    private static void printChars(String str) {
        char[] chars = str.toCharArray();
        String strEven = "";
        String strOdd = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                strEven += chars[i];
            } else {
                strOdd += chars[i];
            }
        }
        System.out.println(strEven + " " + strOdd);

    }
}
