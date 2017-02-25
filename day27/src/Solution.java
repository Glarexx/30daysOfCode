
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Ievgenii Drozd
 * @version 2/25/17
 *          Day 27: Testing
 */
public class Solution {
    private static final int T = 5;
    private static final String[] OUTPUTS = {"YES", "NO", "YES", "NO", "YES"};
    private static final int MIN_N = 4;
    private static final int MAX_N = 200;
    private static final int MIN_K = 3;
    private static final int MIN_AI = -1000;
    private static final int MAX_AI = 1000;

    private static Random random = new Random();

    public static void main(String[] args) {
        System.out.println(T);

        Set<Integer> historyN = new HashSet<>();
        for (int tc = 0; tc < T; tc++) {
            int N;
            do {
                N = generateRandomInt(MIN_N, MAX_N);
            } while (historyN.contains(N));
            historyN.add(N);

            int K = generateRandomInt(MIN_K, N);
            System.out.println(N + " " + K);

            int attendance;
            if (OUTPUTS[tc].equals("YES")) {
                attendance = generateRandomInt(2, K - 1);
            } else {
                attendance = generateRandomInt(K, N - 1);
            }

            List<Integer> a = generateA(N, attendance);
            System.out.println(String.join(" ", a.stream().map(String::valueOf).collect(Collectors.toList())));
        }
    }

    private static int generateRandomInt(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    private static List<Integer> generateA(int N, int attendance) {
        List<Integer> a = new ArrayList<>();

        a.add(0);
        for (int i = 0; i < attendance - 1; i++) {
            a.add(generateRandomInt(MIN_AI, 0));
        }

        for (int i = 0; i < N - attendance; i++) {
            a.add(generateRandomInt(1, MAX_AI));
        }

        Collections.shuffle(a);

        return a;
    }
}