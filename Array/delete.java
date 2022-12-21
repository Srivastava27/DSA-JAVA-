package Array;

class delete{
    public static void main(String[] args){
        int arr[]={1,2,4,6,8};
        int key=4;
        //int res=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                //res=i;
                for(int j=i;j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                }
                break;
            }
        }
        for(int i=0;i<arr.length-1;i++){
            System.out.println(arr[i]);
        }
    }
}






class delElement{

    public static void delete(int arr[], int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                break;
             }
        }
    }


    public static void main(String[] args){
        int arr[]={1,2,5,7,8};
        int key=5;

        delete(arr,key);
        for(int e: arr){
            System.out.println(e+" ");
        }
    }

}

