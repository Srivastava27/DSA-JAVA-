// second largest element in an array

package Array;

import java.util.Arrays;
import java.util.Scanner;

//import javax.sound.sampled.SourceDataLine;

class larElement{
    public static void main(String[] args) {
        int arr[]={-9,-6,-8,-3};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){        //i=1 because we have already considered i=0(arr[0]) as max 
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("largest element found :) "+max);
    }
}


class largest{

    public static void main(String[] args) {
     
        int arr[]={0,-9};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}

class Sort{
    public static void main(String[] args) {
        int arr[]={4,7,0,8,9,2,7,3,5,10};
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
            }
        }
        // System.out.println(arr[i]);
    }
    System.out.println("This is Second Largest Element on this array: "+arr[arr.length-2]);
}
}

class Second{
    public static void main(String[] args) {
        int arr[]={31,2,86,54,3,2,0,23};
        Arrays.sort(arr);
        System.out.println("Second largest: "+arr[arr.length-2]);

        
    }
}

class SecLar{
    public static void main(String[] args) {
        int arr[]={31,2,86,54,3,2,0,23};
        for(int i=0;i<arr.length;i++){

        }
    }
}



class Sec{

    public static int secondt(int arr[]){
        if(arr.length<2) return -1;
        int l=0;
        int sl=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>l){
                sl=l;
                l=arr[i];
            }else if(arr[i]<l){
                if(arr[i]>sl){
                    sl=arr[i];
                }
            }
        }
        return sl;
}

    public static void main(String[] args) {
        int arr[]={31,2,86,54,3,2,0,23};
        int res=secondt(arr);

        System.out.println(res);
    }

}





class RemoveDup{
    public static int remove_Duplicate(int[] arr) {
    if(arr.length<=1){
        return arr.length;
    }

    int start=1;
    for(int i=1;i<arr.length;i++){
        if(arr[i] != arr[i-1]){
            arr[start++]=arr[i];
        }
    }
    return start;
    }

    public static void main(String[] args) {
        int arr[]={1,4,4,4,5,6,7,7,8};

        System.out.println(remove_Duplicate(arr));
    }
}

class remove{
    public static int removeDuplicates(int nums[]){
        if(nums==null || nums.length==0){
            return 0;
        }
        int i=0;

        for(int j=0;j<nums.length;j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int nums[]={1,2,2,3,3,4,4,4,5,6};

        removeDuplicates(nums);

        for (int i : nums) {
            System.out.println(i);
        }
    }
}   


class RemoveDuplicateElements{
    public static void main(String[] args) {
        int arr[]={1,2,2,3,3,4,4,5,5,5,6,7,7,8};

        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != arr[j]){
                arr[j+1]=arr[i];
                j++;
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}


class me{
    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
            System.out.println("i love uh ");
        }
    }
}


class pattern{
    public static void main(String[] args) {
        int n=7;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
           
        
        System.out.println();
        }
    }
}


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

//sum of elements of array

class SumOfElementsOfArray{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int temp=0;
        
        for(int i=0;i<arr.length;i++){
           temp = arr[i] + temp;
         
        }
        System.out.println(temp);
    }
}

//take a number as input and print its multiplication table upto 10

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

// smallest among three numbers

class Smallest{
    public static void main(String[] args) {
      int a,b,c;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter three numbers : ");
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();

      if(a<b && a<c){
        System.out.println("smallest number : "+a);
      }else{
        System.out.println("Smallest number : "+c);
      }
      if(b<c){
        System.out.println(b);
      }else{
        System.out.println(c);
      }
    }
}