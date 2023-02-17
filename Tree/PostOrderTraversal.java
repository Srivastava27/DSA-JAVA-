package Tree;

import java.util.Scanner;

public class PostOrderTraversal {
    Node root;
    Scanner sc;

    PostOrderTraversal(){
        sc=new Scanner(System.in);
    }

    Node CreateTree(){
        System.out.println("enter a Node: ");
        int data=sc.nextInt();
        if(data==-1)return null;

        Node newNode=new Node(data);
        System.out.println("enter "+data+"'s left Node: ");
        newNode.left=CreateTree();
        System.out.println("enter "+data+"'s right Node: ");
        newNode.right=CreateTree();

        return newNode;
    }


    static void PostOrder_Traversal(Node root){
        if(root==null)return;
        PostOrder_Traversal(root.left);
        PostOrder_Traversal(root.right);
        System.out.println(root.data);
    }

    public static void main(String[] args) {
        PostOrderTraversal tree=new PostOrderTraversal();
        Node root=tree.CreateTree();
        PostOrder_Traversal(root);
    }
}

class Node{
    int data;
    Node right,left;

    public Node(int data){
        this.data=data;
    }
}
