package Stack;

public class UsingImplementationOfTwoStackUsingOneArray {
    public static void main(String[] args) throws Exception{
        ImplementTwoStackUsingOneArray stack=new ImplementTwoStackUsingOneArray(5);

        stack.push1(5);
        stack.push1(3);
        stack.push2(4);
        stack.push2(6);
        stack.push1(7);
        stack.push1(7);
        // stack.push1(7);
    

        System.out.println("Peek1: "+stack.peek1());
        System.out.println("Peek1: "+stack.peek2());
        System.out.println("Element popped from first side: "+stack.pop1());
        // System.out.println("Element popped from first side: "+stack.pop1());
        // System.out.println("Element popped from first side: "+stack.pop1());
        // System.out.println("Element popped from first side: "+stack.pop1());
        // System.out.println("Element popped from first side: "+stack.pop1());
        // System.out.println("Element popped from first side: "+stack.pop1());
        System.out.println("Is stack from top1 empty or not: "+stack.isEmpty1());
        System.out.println("Is stack from top2 empty or not: "+stack.isEmpty2());
        System.out.println("Size of Stack1: "+stack.size1());
        System.out.println("Size of stack2: "+stack.size2());
    }
}
