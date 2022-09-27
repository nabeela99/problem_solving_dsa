package Tree;

import java.util.*;

class Node {
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class TopView {
    public static void view(Node root) {
        dfs(0,0, root);
        mapV.entrySet().stream().forEach( s -> System.out.print(s.getValue().data + " "));
    }
    static Map<Integer,Node> mapV = new TreeMap<>();
    static Map<Node,Integer> mapH = new HashMap<>();
    public static void dfs(int vlevel,int hlevel,Node nd) {

        if (nd == null){
            return;
        }
        if(!mapV.containsKey(vlevel) || hlevel < mapH.get(mapV.get(vlevel))) {
            mapV.put(vlevel,nd);
            mapH.put(nd,hlevel);
        }
        dfs(vlevel-1,hlevel+1 , nd.left);
        dfs(vlevel+1,hlevel+1 , nd.right);
    }

    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
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
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        view(root);
    }
}
