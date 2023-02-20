package Tree;

public class TwoSum4 {
    TreeNode root;
    public boolean findTarget(TreeNode root, int k) {
        if (root == null){
            return false;
        }
        int num = k - root.val;
        if (isOtherNumber(num,root,k)){
            return true;
        }else{
            findTarget(root.left,k);
            findTarget(root.right,k);
        }
        return false;
    }
    public boolean isOtherNumber(int n,TreeNode r,int k){
        if (r == null){
            return false;
        }
        if (n == r.val){
             return true;
        }else if (n < r.val){
            return isOtherNumber(n,r.left,k);
        }else if (n > r.val){
            return isOtherNumber(n,r.right,k);
        }
        return false;
    }

    public static void main(String[] args) {
        int sum = 15;
        TwoSum4 p1 = new TwoSum4();
        p1.root = new TreeNode(5);
        p1.root.left = new TreeNode(3);
        p1.root.right = new TreeNode(8);
        p1.root.left.left = new TreeNode(2);
        p1.root.left.right = new TreeNode(4);
        p1.root.right.left = new TreeNode(6);
        p1.root.right.right = new TreeNode(9);
//        p1.root.right.right.left = new TreeNode(5);
//        p1.root.right.right.right = new TreeNode(-2);
        System.out.println(p1.findTarget(p1.root, sum));
    }
}
