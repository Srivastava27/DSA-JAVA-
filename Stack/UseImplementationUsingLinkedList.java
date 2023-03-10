package Stack;

import java.util.ArrayDeque;
import java.util.Stack;

class UseImplementationUsingLinkedList {
    public static void main(String[] args) throws Exception {
        ImplementationUsingLinkedList stack=new ImplementationUsingLinkedList();
        // Stack<Integer> stack=new Stack<>();
        // ArrayDeque<Integer> stack=new ArrayDeque<>();
        
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);

        System.out.println("Popped elements: "+stack.pop());
        System.out.println("Peak of the Stack: "+stack.peek());
        System.out.println("Size of the stack: "+stack.size());
        System.out.println("Stack is empty(true/false): "+stack.isEmpty());

    }
}
