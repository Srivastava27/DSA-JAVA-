package Array;

import java.util.Arrays;

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
