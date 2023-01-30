package DSAsheetApnaCollege;

import java.util.ArrayList;
import java.util.Collections;

class ReverseArray {

    public static void Reverse(int arr[], int res[]){
        int temp=0;
        for(int i=arr.length-1;i>=0;i--){
            res[temp++]=arr[i];
        }
        for (int i : res) {
            System.out.println(i);
        }
        
    }

    public static void main(String[] args) {
        int arr[]={2,3,4,5,6};
        int res[]=new int[arr.length];
        Reverse(arr, res);
    }
}



///////////-------------------using space complexity--------------------------------------///////////

class reverse{

    public static void reverseA(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }


        for (int i : arr) {
            System.out.println(i);
            
        }
    }

    public static void main(String[] args) {
        int arr[]={2,3,4,5,6};
        reverseA(arr);
    }
}


///////-------------------Array list---------------------------------//

class Rev{

    // public static void RevArr(ArrayList<Integer> list ){
        
    //     int start=0;
    //     int end=list.size();
    //     int arrS=list.get(start);
    //     int arrL=list.get(end);
    //     while(start<end){
    //         int temp=arrS;
    //         arrS=arrL;
    //         arrL=temp;
    //         start++;
    //         end--;
    //     }
    //     for (Integer i : list) {
    //         System.out.println(i);
    //     }
       
    // }


    public static void main(String[] args) {

        ArrayList <Integer> list=new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        System.out.println("before reversing: "+list);
        Collections.reverse(list);
        System.out.println("reversed array: "+list);
    }
}