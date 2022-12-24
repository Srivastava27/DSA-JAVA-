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


//addition with user input

class AddMatrix{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of row 1 :");
        int row=sc.nextInt();
        
        System.out.println("enter the size of column 1 : ");
        int col=sc.nextInt();
        
        System.out.println();
        int arr[][]=new int[row][col];

        System.out.println("Enter elements of first matrix :");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
               
            }
        }
        System.out.println("Matrix 1 :");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" "); 
    }
    System.out.println();
}
System.out.println("Enter the size of row 2 :");
int row2=sc.nextInt();

System.out.println("Enter the size of column 2 : ");
int col2=sc.nextInt();

System.out.println();
int arr2[][]=new int[row2][col2];

System.out.println("Enter elements of matrix 2:");
for(int i=0;i<row2;i++){
    for(int j=0;j<col2;j++){
        arr2[i][j]=sc.nextInt();
       
    }
}
System.out.println("Matrix 2 :");
for(int i=0;i<row2;i++){
    for(int j=0;j<col2;j++){
        System.out.print(arr2[i][j]+" "); 
}
System.out.println();
}
System.out.println("Result of addition of two matrices :");
int arr3[][]=new int[arr.length][arr.length];
for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr.length;j++){
        arr3[i][j]=arr[i][j]+arr2[i][j];
        System.out.print(arr3[i][j]+" ");
    }
    System.out.println();
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

    System.out.println("Enter key which you want to find :");
    int key=sc.nextInt();
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
        if(arr[i][j]==key){
            System.out.println(i+" , "+j);
        }    
        }

    }
}
}
}


class MultiplyMatrix{
    public static void main(String[] args) {
        
        int arr1[][]={
            {1,2,3},
            {1,2,3}};
        int arr2[][]={
            {1,2,3},
            {1,2,3}};
        int res[][]=new int[2][3];

        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                res[i][j]=0;
                for(int k=0;k<res.length;k++){
                    res[i][j]+=arr1[i][k]*arr2[k][j];
                }
                
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}