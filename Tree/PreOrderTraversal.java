package Tree;

import java.util.Scanner;

public class PreOrderTraversal {
    Node root;
    Scanner sc;

    PreOrderTraversal(){
        sc=new Scanner(System.in);
    }


    Node CreateTree(){
        System.out.println("Enter a Node data: ");
        int data=sc.nextInt();

        if(data==-1)return null;
        Node newNode=new Node(data);
        System.out.println("Enter "+data+"'s left node data");
        newNode.left=CreateTree();
        System.out.println("Enter "+data+"'s right node data");
        newNode.right=CreateTree();
        return newNode;
    }

    public static void PreOrder_Traversal(Node root){
        if(root==null)return;

        System.out.println(root.data);
        PreOrder_Traversal((root.left));
        PreOrder_Traversal((root.right));
    }

    public static void main(String[] args) {
        PreOrderTraversal tree=new PreOrderTraversal();
        Node root=tree.CreateTree();
        PreOrder_Traversal(root);
    }


    
}
class Node{
    int data;
    Node left,right;

    public Node(int data){
        this.data=data;
    }
}
