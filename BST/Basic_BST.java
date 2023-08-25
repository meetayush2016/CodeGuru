package Anuj;
import java.util.*;
// writing this code for the 3rd time

public class BST {
    static Scanner sc = null ;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = creatTree();
        System.out.println();
        System.out.println("IN-ORDER : ");
        inOrder(root);
        System.out.println();
        System.out.println("PRE-ORDER : ");
        preOrder(root);
        System.out.println();
        System.out.println("POST-ORDER : ");
        postOrder(root);
        System.out.println();
        System.out.println("Height of tree : "+height(root));
        System.out.println("Number of nodes : "+size(root));



    }
    static Node creatTree(){
        Node root = null ;
        System.out.println("Enter Node value : ");
        int val = sc.nextInt();
        if(val == -1) return null ;
        root = new Node(val);

        // left value
        System.out.println("Enter left of node : "+val);
        root.left = creatTree();

        System.out.println("Enter right of node :"+val);
        root.right = creatTree();

        //return node form here ;
        return root;
    }
    static void inOrder(Node root){
        if(root == null) return ;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);


    }
    static void postOrder(Node root){
        if(root == null) return ;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");

    }
    static void preOrder(Node root){
        if(root == null) return ;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);


    }
    static int height(Node root){
        if(root == null ) return 0 ;
        return Math.max(height(root.left),height(root.right)) +1 ;
    }
    static int size(Node root){
        if(root == null) return 0 ;
        return size(root.left)+size(root.right)+1 ;
    }
}
class Node{
    Node left ;
    Node right;
    int data;
    Node(int data){
        this.data = data;
    }
}
