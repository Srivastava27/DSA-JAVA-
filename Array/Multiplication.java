package Array;

import java.util.Scanner;

class Multiplication{
    public static void main(String[] args) {
        
        int n=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number : ");
        n=sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(n+"X"+i+"="+n*i);
        }
    }
}

