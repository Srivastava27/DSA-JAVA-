package Strings;
import java.util.*;

class insertionInstringbuilder {
    public static void main(String[] args) {

        //insert
        StringBuilder s=new StringBuilder("sona");
        s.insert(0, 't');
        System.out.println(s);

        //delete
        s.delete(0, 1); // ending index include nhi hota
        System.out.println(s);

        //append
        s.append("a");
        // s.append("a");
        // s.append("a");
        System.out.println(s);

        //length
        System.out.println(s.length());
    } 
}
