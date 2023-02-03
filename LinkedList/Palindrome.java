package LinkedList;

public class Palindrome {

    public static Node6 middlel(Node6 head){
        Node6 slow=head;
        Node6 fast=head;
        while(fast!=null && fast.next!=null){
            
            
            fast=fast.next.next;
            slow=slow.next;

            
        }
        // System.out.println(slow.data);
        return slow;
    }


    public static Node6 rev(Node6 head){
        Node6 curr=head;
        Node6 prev=null;
        while(curr!=null){
            Node6 temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    } 

    public static void print(Node6 head){
        Node6 curr=head;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }
        System.out.println();
    }



    public static boolean isPalindrome(Node6 head){

        if(head==null || head.next==null)return true;

        Node6 mid=middlel(head);
        Node6 reverse=rev(mid);
        Node6 curr=head;
        Node6 last=reverse;
       
        while(curr!=null){
            if(curr.data!=last.data){
                return false;
            }else{
                curr=curr.next;
                last=last.next;
                // return false;
            } 
                
        }
            return true;
        
        
    }


    public static void main(String[] args) {
        Node6 n1=new Node6(1);
        Node6 n2=new Node6(2);
        Node6 n3=new Node6(3);
        Node6 n4=new Node6(2);
        Node6 n5=new Node6(1);
        // Node6 n6=new Node6(6);
 
        Node6 head=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        // n5.next=n6;

        // print(head);
        
        // middlel(head);
        
        
        
        System.out.println(isPalindrome(head));
        
    }
}


class Node6{
    int data;
    Node6 next;

    public Node6(int data){
        this.data=data;
    }
}