package Stack;

class UseImplementationUsingArray {
    public static void main(String[] args) throws Exception {
        Implementation stack=new Implementation(3);

        stack.push(2);
        stack.push(4);
        stack.push(1);


        // stack.push(8);
        // stack.push(5);

        System.out.println("Peek of the stack: "+stack.peek());

        System.out.println("Is stack empty (true/false): "+stack.isEmpty());

        System.out.println("Size of the stack: "+stack.size());

        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
    }
}
