import java.util.Scanner;

/**
 * @author Ievgenii Drozd
 * @version 2/23/17
 *          Day 22: Binary Search Trees
 */
public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        System.out.println(getHeight(root));
    }

    private static int getHeight(Node root) {
        if (root == null) return -1;
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }

    private static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
}
