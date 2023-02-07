package Stack;

import java.util.Stack;

public class InfixToPrefix {

    public static boolean isOperator(char curr){
        if(curr=='+' || curr=='-' || curr=='*' || curr=='/')return true;
        return false;
    } 

    public static int precedencey(char curr){
        if(curr=='+' || curr=='-')return 1;
        else if(curr=='*' || curr=='/')return 2;
        else return -1;
    }

    public static void prefix(String str){
        StringBuilder res=new StringBuilder();
        Stack<Character> stack=new Stack<>();

        for(int i=str.length()-1;i>=0;i--){
            char curr=str.charAt(i);
            if(curr==')'){
                stack.push(curr);
            }else if(curr=='('){
                while(stack.peek()!=')'){
                        res.append(stack.pop());
                    }
                    stack.pop();
            }else if(isOperator(curr)){
                if(!stack.isEmpty() && precedencey(curr)<precedencey(stack.peek())){
                    res.append(stack.pop());
                }
                stack.push(curr);
            }else{
                res.append(curr);
            }
        }
        while(!stack.isEmpty()){

            res.append(stack.pop());
        }

        System.out.println(res.reverse());
        
    }



    public static void main(String[] args) {
        String str="(a-b*c)/((e+f)*g/h)";
        prefix(str);
    }
}
