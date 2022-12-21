package Array;

import java.util.Scanner;

class arrayMain{
    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner sc = new Scanner(System.in);
        
        for(int i=1;i<5;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<5;i++){
            System.out.println("age of roll no "+i+" "+"is :"+arr[i]);
        }
    }
}