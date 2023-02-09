package Strings;

public class Concatenation {
    public static void main(String[] args) {
        //concatenation
        String firstname="vanshika";
        String Lastname="srivastava";
        String fullname=firstname+" "+Lastname;
        System.out.println(fullname);
        System.out.println(fullname.length());

        //charAt           it will each character one by one
        for(int i=0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }
    }
}
