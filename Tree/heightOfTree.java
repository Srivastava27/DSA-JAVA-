package Tree;

import java.util.Scanner;

public class heightOfTree {
    Node root;
    Scanner sc;

    heightOfTree(){
        sc=new Scanner(System.in);
    }

    Node CreateTree(){
        System.out.println("enter a node: ");
        int data=sc.nextInt();
        if(data==-1)return null;

        Node newNode=new Node(data);
        System.out.println("enter "+data+"'s left node data");
        newNode.left=CreateTree();
        System.out.println("enter "+data+"'s right node data");
        newNode.right=CreateTree();
        return newNode;

    }


    public static void main(String[] args) {
        heightOfTree tree=new heightOfTree();
        Node root=tree.CreateTree();

        System.out.println(heightOf_Tree(root));
    }
    

    static int heightOf_Tree(Node root){
        if(root==null)return 0;

        int leftheight=heightOf_Tree(root.left);
        int righttheight=heightOf_Tree(root.right);
        return Math.max(leftheight, righttheight)+1;
    }
}
class Node{
    int data;
    Node left,right;

    public Node(int data){
        this.data=data;
    }
}
