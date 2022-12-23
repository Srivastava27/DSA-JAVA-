package Array;

import java.util.Scanner;

//print a 2D array
class matrix{
    public static void main(String[] args) {
        int arr[][]={
            {2,3,4},
            {5,5,5},
            {0,0,0}
        };
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}

//addition of two matrices
class matrices{
    public static void main(String[] args) {
        int arr[][]={
            {2,3,4,1},
            {5,5,5,3},
            {0,0,0,5},
            {4,4,5,5}
        };
        int arr2[][]={
            {2,6,4,1},
            {4,4,3,3},
            {0,1,0,4},
            {0,0,0,0}
        };
        int arr3[][]=new int[4][4];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr3[i][j]=arr[i][j]+arr2[i][j];
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
    }
}

//searching for an element in a matrix

class twoDarray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.println("matrix : ");
        System.out.println("enter row :");
        int row=sc.nextInt();
        
        System.out.println("enter column : ");
        int col=sc.nextInt();
        
        System.out.println();
        int arr[][]=new int[row][col];

        System.out.println("enter elements :");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
               
            }
        }
        System.out.println("matrix :");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" "); 
    }
    System.out.println();
}

    }
}