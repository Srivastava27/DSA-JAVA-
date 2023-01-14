package BinarySearch;

class MergeTwoArrays{

    public static void main(String[] args) {
        int arr1[]={1,3,5,7,9};
        int arr2[]={2,2,4,8};

        int arr3[]=new int[arr1.length+arr2.length];
        int k=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){

                if(arr1[i]<arr2[j]){
                    arr3[k]=arr1[i];
                    k++;
                    i++;
                    j-=1;
                }else{
                    arr3[k]=arr2[j];
                    k++;
                }
            }
        }
        for (int i : arr3){
            System.out.println(i);
        }
        
    }
}