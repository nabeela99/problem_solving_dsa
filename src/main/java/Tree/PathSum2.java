package Tree;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PathSum2 {
    TreeNode root;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        sum(root,0,targetSum,list,res);
        return res;
    }
    public static void sum(TreeNode root,int begin,int sum,List<Integer>l1, List<List<Integer>> res){
        if (root == null){
            return;
        }
        int sum1 = begin + root.val;
        if (sum1 < sum || (sum < 0 && sum1 > sum)){
            l1.add(root.val);
        }else if (sum1 == sum){
            l1.add(root.val);
            if (root.left == null && root.right == null)
                res.add(new ArrayList<>(l1));
        }else if (sum1 > sum){
            if (root.left == null && root.right == null){
                return;
            }else{
                l1.add(root.val);
            }
        }
        sum(root.left,sum1,sum,l1,res);
        sum(root.right,sum1,sum,l1,res);
        if (l1.size() > 0) {
            l1.remove(l1.size() - 1);
        }
    }
    public static void main(String[] args) {
        int sum = 9;
        PathSum2 p1 =  new PathSum2();
        p1.root = new TreeNode(-1);
//        p1.root.left = new TreeNode(null);
        p1.root.right = new TreeNode(9);
//        p1.root.left.left = new TreeNode(11);
//        p1.root.left.left.left = new TreeNode(7);
//        p1.root.left.left.right = new TreeNode(2);
        p1.root.right.left = new TreeNode(-6);
        p1.root.right.right = new TreeNode(3);
//        p1.root.right.right.left = new TreeNode(5);
        p1.root.right.right.right = new TreeNode(-2);
        System.out.println(p1.pathSum(p1.root, sum));
    }
}
