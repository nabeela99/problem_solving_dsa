package Tree;

import java.util.Scanner;

public class PathSum {
    public static TreeNode insert(TreeNode root, int data) {
        if (root == null) {
            return new TreeNode(data);
        } else {
            TreeNode cur;
            if (data <= root.val) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        TreeNode root = null;
        int sum = scan.nextInt();
        while (t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        PathSum p1 = new PathSum();
        System.out.println(p1.hasPathSum(root, sum));
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return sum(root, targetSum, 0);
    }

    public boolean sum(TreeNode root, int sum, int current) {
        if (root == null)
            return false;

        if (current + root.val == sum && root.left == null && root.right == null) {
            return true;
        }

        if (sum(root.right, sum, current + root.val))
            return true;

        if (sum(root.left, sum, current + root.val))
            return true;
        return false;
    }
}
