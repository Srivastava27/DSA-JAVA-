package Array;

class ElementSearch{
    public static void main(String[] args){
        int arr[]={2,4,6,88,100};
         int res=0;
         int key=88;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                res=i;
                break;
            }
        }
        if(res==0){
            System.out.println("Element does not found");
        }else{
            System.out.println("Element found at index: "+res);
        }
    }
}