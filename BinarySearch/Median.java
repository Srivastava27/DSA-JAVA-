package BinarySearch;

import java.util.Arrays;

class MedianInInfiniteArray{
    public static void main(String[] args) {
        int arr1[]={2,3,4,5,6,7};
        int arr2[]={9,10,11,13};
        int start=0;
        int res[]=new int[arr1.length+arr2.length];
        int end=res.length;
        for(int i=0;i<arr1.length;i++){
            res[i]=arr1[i];
        }
        for(int j=0;j<arr2.length;j++){
            res[arr1.length+j]=arr2[j];
        }
        Arrays.sort(res);
        
        if(end%2==0){
            int temp=0;
            for(int i=0;i<res.length;i++){
                temp+=res[i];
            }
            temp/=end;
            System.out.println(temp);
        }else{
            int mid=(start+end)/2;
            System.out.println(res[mid]);
        }
    }
}