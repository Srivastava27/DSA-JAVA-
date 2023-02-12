package Queue;

import java.util.Queue;

public class UsingImplementationwithCircularArray {
    public static void main(String[] args) throws Exception{
        ImplementationUsingCircularArray queue=new ImplementationUsingCircularArray(4);
        
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        // queue.enqueue(50);
        


        // System.out.println(queue.dequeue());
        System.out.println(queue.isFull());
        System.out.println(queue.isempty());
    }
}
