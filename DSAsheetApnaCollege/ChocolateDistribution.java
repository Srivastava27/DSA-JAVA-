///ques 5//////

package DSAsheetApnaCollege;

import java.util.Arrays;

public class ChocolateDistribution {

public static int Minn_diff(int arr[],int students, int min_diff){
    
    Arrays.sort(arr);

    if(students==0 || arr.length==0){                
        return 0;
    }

    //beacuse every student must get atleast one chocolate
    if(arr.length<students){                   
        return-1;
    }

    for(int i=0;i+students-1<arr.length;i++){
        int temp=arr[i+students-1]-arr[i];
        if(temp<min_diff){
            min_diff=temp;
        }
    }

    return min_diff;
}




    public static void main(String[] args) {
        int arr[]={3,4,1,9,56,7,9,12};
        int students=5;    
        int min_diff=Integer.MAX_VALUE;     
        int res=Minn_diff(arr, students, min_diff);
        System.out.println(res);                       
    }
}
