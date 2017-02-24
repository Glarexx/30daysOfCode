import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author Ievgenii Drozd
 * @version 2/23/17
 *          Day 23: BST Level-Order Traversal
 */
public class Solution {
    private static void levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node head = queue.poll();

            if (head == null) {
                continue;
            }

            System.out.print(head.data + " ");

            queue.offer(head.left);
            queue.offer(head.right);
        }
        System.out.println();
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

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }
}
