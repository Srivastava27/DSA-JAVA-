package Stack;

import java.util.ArrayDeque;
import java.util.Stack;

class postfix_exp{



    public static boolean operator(char ch){
        return ch=='+' || ch=='-' || ch=='*' || ch=='/';
            
    }


    public static int precedence(char ch){
        if(ch=='+' || ch=='-')return 1;
        else if(ch=='*' || ch=='/')return 2;
        else return -1;
    }
    

    static void postfix_expp(String str){
        StringBuilder s=new StringBuilder();
        ArrayDeque<Character> stack=new ArrayDeque<>();

        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            if(curr=='('){
                stack.push(curr);
            }else if(curr==')'){
                while(stack.peek()!='('){
                    if(precedence(curr)<=precedence(stack.peek())){
                        s.append(stack.pop());
                    }
                }
                stack.pop();
            }else if(operator(curr)){
                while(!stack.isEmpty() && precedence(curr)<=precedence(stack.peek())){
                    s.append(stack.pop());
                }
                stack.push(curr);
            }else{
                s.append(curr);
            }
        }
        while(!stack.isEmpty()){

            s.append(stack.pop());
        }
        System.out.println(s);

    }


    public static void main(String[] args) {
        String input="(a+b)*c";
        // String output=postfix_expp(input);
        // System.out.println(output);
        postfix_expp(input);
    }
}






//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



// class InfixToPostfix {


//     public static boolean operator(char ch){
//         return ch=='+' || ch=='-' || ch=='*' || ch=='/';
            
//     }


//     public static int precedence(char ch){
//         if(ch=='+' || ch=='-')return 1;
//         else if(ch=='*' || ch=='/')return 2;
//         else return -1;
//     }
    


//     public static void infixToPostfix(String str){
//         StringBuilder res=new StringBuilder();
//         Stack<Character> stack=new Stack<>();
        
//         for(int i=0;i<str.length();i++){
//             char curr=str.charAt(i);

//             if(curr=='('){
//                 stack.push(curr);
//             }else if(curr==')'){
//                 // stack.push(curr);
//                 while(!stack.isEmpty()){
//                     if(operator(curr)){
//                     res.append(stack.pop());
//                 }
//                 stack.pop();
//             }
             
//             }else if(operator(curr)){
//                 if(stack.isEmpty()){
//                     stack.push(curr);
//                 }
//                 if( precedence(curr)<=precedence(stack.peek())){
//                     res.append(stack.pop());
//                     stack.push(curr);
//                 }
//                 stack.push(curr);
//             }else{
//                 res.append(curr);
//             }
//         }
        
//         while(!stack.isEmpty()){

//             res.append(stack.pop());
//         }

//         System.out.println(res);
//     }


//     public static void main(String[] args) {
        
//         // StringBuilder str=new StringBuilder();
//             String input="(a+b)*c";

//             infixToPostfix(input);
//             // System.out.println(output);

            

//         }
//     }

