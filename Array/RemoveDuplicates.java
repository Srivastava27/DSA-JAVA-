package Array;

public class RemoveDuplicates {
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


// one more method 

class Remove{
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