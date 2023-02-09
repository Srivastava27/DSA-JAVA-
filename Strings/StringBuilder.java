package Strings;

import java.util.*;

class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("vanshika");
        System.out.println(sb); 

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(6, 't');
        System.out.println(sb);


    }

}
