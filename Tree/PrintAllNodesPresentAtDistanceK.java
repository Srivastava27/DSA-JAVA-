package Tree;

import java.util.Scanner;

public class PrintAllNodesPresentAtDistanceK {
    Node root;
    Scanner sc;

    public PrintAllNodesPresentAtDistanceK(){
        sc=new Scanner(System.in);
    }

    Node createTree(){
        System.out.println("enter a node: ");
        int data=sc.nextInt();

        if(data==-1)return null;
        Node newNode=new Node(data);
        System.out.println("enter "+data+"'s left node data: ");
        newNode.left=createTree();
        System.out.println("enter "+data+"'s right node data: ");
        newNode.right=createTree();
        return newNode;

    }


    static void Print_All_Nodes_Present_At_Distance_K(Node root, int k){
        if(root==null)return;

        if(k==0){
            System.out.println(root.data);
            return;
        }
        Print_All_Nodes_Present_At_Distance_K(root.left, k-1);
        Print_All_Nodes_Present_At_Distance_K(root.right, k-1);
    }


    public static void main(String[] args) {
        PrintAllNodesPresentAtDistanceK tree=new PrintAllNodesPresentAtDistanceK();

        Node root=tree.createTree();
        int k=2;

        Print_All_Nodes_Present_At_Distance_K(root, k);
    }
}

class Node{
    int data;
    Node right,left;

    public Node(int data){
        this.data=data;
    }
}
