//--------------------without hashing-----------------------------//

package DSAsheetApnaCollege;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean Duplicate(int arr[]){
        Arrays.sort(arr);

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,1};
        boolean res=Duplicate(arr);
        System.out.println(res);
    }
}


//-----------------------with hashing----------------------------------//

class Duplicate{

    public static boolean Dup(int arr[]){
            HashSet<Integer> hashSet=new HashSet();
            for(int i=0;i<arr.length;i++){
                if(hashSet.contains(arr[i])){
                    return true;
                }else{
                    hashSet.add(arr[i]);
                }
            }
            return false;
    }



    public static void main(String[] args) {

        int arr[]={1,2,3,1};
        boolean res=Dup(arr);
        System.out.println(res);
    }
}