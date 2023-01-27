///-------------------Ques 5-----------------------///


///-------------------without ArrayList--------------------///

package DSAsheetApnaCollege;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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


///---------------------------with ArrayList-------------------------//

class ChocoDistribution{

    public static long Min_diff(ArrayList<Integer> list, int students, int min){

        for (Integer i : list) {
            if(min>(i+students-1)-i){
                min=(i+students-1)-i;
            }
        }

        return (long)min;
    } 


    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(7);
        list.add(9);
        list.add(12);
        list.add(56);
        System.out.println(list);

        int students=3;
        int min=Integer.MAX_VALUE;
        long res=Min_diff(list, students, min);
        System.out.println(res);
    }
}
