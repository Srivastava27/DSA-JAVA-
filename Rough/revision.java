package Rough;

public class revision{
    public static void main(String[] args){
        int nums[]={12,34,4,6,77,8};
        int target=8;
        int ans=linearSearch(nums,target);
    
        System.out.println(ans);
    }

    public static int linearSearch(int arr[],int target){

        if (arr.length==0){
            return -1;
        }
    

    for(int index=0;index<arr.length;index++){
        int element=arr[index];
        if(element==target){
            return index;
        }

    }
    return 0;
    }
}

