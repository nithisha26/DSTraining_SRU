import java.util.*;
public class BinarySearchTree {

    // Represent a node of binary tree
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    // Root of the BST
    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    // Insert a new key into the BST
    public void insert(int data) {
        root = insertRec(root, data);
    }

    // Recursive function to insert a new key in the BST
    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    
    // In-order traversal of the BST
    private void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
        //System.out.println();
    }

    // Recursive function for in-order traversal
    private void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
        //System.out.println();
    }

    // Recursive function for in-order traversal
    private void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
        //System.out.println();
    }

    private int sum(Node root){
        if(root==null){
            return 0;
        }
        int leftSum=sum(root.left);
        int rightSum=sum(root.right);
        return root.data+leftSum+rightSum;
    }

    private static int evenSum(Node root){
        if(root==null){
            return 0;
        }
        int leftSum=evenSum(root.left);
        int rightSum=evenSum(root.right);
        if(root.data%2==0)
        return root.data+leftSum+rightSum;
        return leftSum+rightSum;    
    }
    private static int oddSum(Node root){
        if(root==null){
            return 0;
        }
        int leftSum=oddSum(root.left);
        int rightSum=oddSum(root.right);
        if(root.data%2!=0)
        return root.data+leftSum+rightSum;
        return leftSum+rightSum;    
    }

    private static int diffSum(Node root){
        if(root==null){
            return 0;
        }
        int leftSum=diffSum(root.left);
        int rightSum=diffSum(root.right);
        if(root.data%2==0)
        return root.data+leftSum+rightSum;
        return (leftSum+rightSum)-root.data;    
    }

    private static int height(Node root){
        if(root==null){
            return -1;
        }
        int leftHgt=height(root.left);
        int rightHgt=height(root.right);
        return 1+Math.max(leftHgt,rightHgt);
    }

    private static boolean bal(Node root){
        return Math.abs(height(root.left)-height(root.right))<=1;
    }

    private static int leafNodes(Node root){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        return leafNodes(root.left)+leafNodes(root.right);
    }

    private static int sumleafNodes(Node root){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return root.data;
        }
        return sumleafNodes(root.left)+sumleafNodes(root.right);
    }

    private static boolean search(Node root,int val){
        if(root==null){
            return false;
        }
        if(root.data==val){
            return true;
        }
        if(val<root.data){
            return search(root.left, val);
        }
        return search(root.right,val);
    }

    private static int depth(Node root,int val,int c){
        if(root==null){
            return -1;
        }
        if(root.data==val){
            return c;
        }
        if(val<root.data){
            return depth(root.left, val,c+1);
        }
        return depth(root.right,val,c+1);
    }

    private static void topView(Node root,int c,TreeMap<Integer,Integer> mt){
        class Edge{
            Node val;
            int cnt;
            Edge(Node val,int cnt){
                this.val=val;
                this.cnt=cnt;
            }
        }
        Queue<Edge> q=new LinkedList<Edge>();
        q.add(new Edge(root,0));
        while(!q.isEmpty()){
            Edge e=q.remove();
            Node curr=e.val;
            int x=e.cnt;
            if(!mt.containsKey(x)){
                mt.put(x,curr.data);
            }
            if(curr.left!=null){
                q.add(new Edge(curr.left, x-1));
            }
            if(curr.right!=null){
                q.add(new Edge(curr.right,x+1));
            }
        }

    }
    private static void leftView(Node root,int c,TreeMap<Integer,Integer> ml){
        if(root==null){
            return;
        }
        if(!ml.containsKey(c)){
            ml.put(c,root.data);
        }
        leftView(root.left, c+1, ml);
        leftView(root.right, c+1, ml);
    }
    private static void rightView(Node root,int c,TreeMap<Integer,Integer> mr){
        if(root==null){
            return;
        }
        if(!mr.containsKey(c)){
            mr.put(c,root.data);
        }
        rightView(root.right, c+1, mr);
        rightView(root.left, c+1, mr);
    }
    private static void bottomView(Node root,int c,TreeMap<Integer,Integer> mb){
        class Edge{
            Node val;
            int cnt;
            Edge(Node val,int cnt){
                this.val=val;
                this.cnt=cnt;
            }
        }
        Queue<Edge> q=new LinkedList<Edge>();
        q.add(new Edge(root,0));
        while(!q.isEmpty()){
            Edge e=q.remove();
            Node curr=e.val;
            int x=e.cnt;
            mb.put(x,curr.data);
            if(curr.left!=null){
                q.add(new Edge(curr.left, x-1));
            }
            if(curr.right!=null){
                q.add(new Edge(curr.right,x+1));
            }
        }
    }


    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Insert nodes into the BST
        bst.insert(13);
        bst.insert(10);
        bst.insert(20);
        bst.insert(7);
        bst.insert(11);
        bst.insert(25);
        bst.insert(5);
        bst.insert(12);

        // Display the BST using in-order traversal
        System.out.println("inorder traversal");
        bst.inorder(bst.root);
        System.out.println();
        System.out.println("preorder traversal");
        bst.preorder(bst.root);
        System.out.println();
        System.out.println("postorder traversal");
        bst.postorder(bst.root);
        System.out.println();
        System.out.println(bst.sum(bst.root));
        System.out.println(evenSum(bst.root));
        System.out.println(oddSum(bst.root));
        System.out.println(Math.abs(diffSum(bst.root)));
        System.out.println(height(bst.root));
        System.out.println(bal(bst.root));
        System.out.println(leafNodes(bst.root));
        System.out.println(sumleafNodes(bst.root));
        System.out.println(search(bst.root, 30));
        System.out.println(depth(bst.root, 5,0));
        TreeMap<Integer,Integer> mt=new TreeMap<>();
        topView(bst.root, 0, mt);
        for (Integer key : mt.keySet()) {
            System.out.print(mt.get(key)+" ");
        }
        System.out.println();
        TreeMap<Integer,Integer> ml=new TreeMap<>();
        leftView(bst.root, 0, ml);
        for (Integer key : ml.keySet()) {
            System.out.print(ml.get(key)+" ");
        }
        System.out.println();
        TreeMap<Integer,Integer> mr=new TreeMap<>();
        rightView(bst.root, 0, mr);
        for (Integer key : mr.keySet()) {
            System.out.print(mr.get(key)+" ");
        }
        System.out.println();
        TreeMap<Integer,Integer> mb=new TreeMap<>();
        bottomView(bst.root, 0, mb);
        for (Integer key : mb.keySet()) {
            System.out.print(mb.get(key)+" ");
        }
        
    }
}
