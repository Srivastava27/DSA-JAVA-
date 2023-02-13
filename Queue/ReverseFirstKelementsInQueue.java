package Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKelementsInQueue {

    public static Queue<Integer> reverse(Queue<Integer> queue, int k){
        if(k>queue.size() || queue.isEmpty())return queue;
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<k;i++){
            stack.push(queue.poll());
            // queue.add(stack.pop());
        }
        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }

        for(int i=0;i<queue.size()-k;i++){
            queue.add(queue.poll());
        }

        return queue;
    }


    public static void main(String[] args) {
        Queue<Integer> queue=new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println(reverse(queue, 3));
    }
}
