package Queue;

public class UsingImplementationOfQueueWithLinkedList {
    public static void main(String[] args)throws Exception {
        ImplementationOfQueueUsingLinkedList qll=new ImplementationOfQueueUsingLinkedList();

        qll.enqueue(10);
        qll.enqueue(20);
        qll.enqueue(30);

        System.out.println(qll.dequeue());
        // System.out.println(qll.dequeue());
        // System.out.println(qll.isEmpty());
        System.out.println(qll.getFront());
    }
}
