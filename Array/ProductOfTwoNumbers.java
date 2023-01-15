package Array;

import java.util.Scanner;

class ProductOfTwoNumbers{
    public static void main(String[] args) {
        int res=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("first number : "+a);
        System.out.println("second number : "+b);

        res=a*b;
        System.out.println("multiplication of two numbers : "+res);
        sc.close();
    }
    
}