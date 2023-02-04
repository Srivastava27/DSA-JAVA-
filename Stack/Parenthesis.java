package Stack;

import java.util.ArrayDeque;

class Parenthesis {

    static boolean isValid(String str){
        ArrayDeque<Character> stack=new ArrayDeque<>();
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            if(curr=='{' || curr=='(' ||curr=='['){
                stack.push(curr);
                continue;
            }

            char head='a';
            switch(curr){
                case ')':
                head=stack.pop();
                if(head!='('){
                    return false;
                    
                }
                break;

                case '}':
                head=stack.pop();
                if(head!='{'){
                    return false;
                    
                }
                break;

                case ']':
                head=stack.pop();
                if(head!='['){
                    return false;
                    
                }
                break;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
       String str="{a[(a-b)(i}";
    //    String str3="{a[(a-b)(i)]}";
    //    String str2=" ";

       System.out.println(isValid(str));


    }
}
