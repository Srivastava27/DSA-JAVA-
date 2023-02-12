package Queue;

public class UsingImplementationofQueueWithArray {
    public static void main(String[] args)throws Exception {
        ImlementationOfQueueUsingArray qll=new ImlementationOfQueueUsingArray(5);

    qll.enqueue(10);
    qll.enqueue(20);
    qll.enqueue(30);
    qll.enqueue(40);
    // qll.enqueue(50);

    System.out.println(qll.dequeue());
    }
    
}
