package Array;

// find the number greater than the average of the numbers of a given array

class GreaterNumber{
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,8};
        int temp=0;
        int j=0;

        for(int i=0;i<arr.length;i++){
            temp=arr[i]+temp;
            j=temp/arr.length;
        }
        for(int i=0;i<arr.length;i++){
            if(j<arr[i]){
                System.out.println(arr[i]);
            }
        }
    }
}


// min and max value of an array

class MinMax{
    public static void main(String[] args) {
        int arr[]={2,4,1,3,5,6};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}


// arranging 0s and 1s in a sequence

class ZeroAndOnes{
    public static void main(String[] args) {
        int arr[]={0,1,0,1,1,0,0};
        int temp=0;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                temp=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=temp;
            }
            System.out.println(temp);
        }
        
    }
}

class Zeroes{
    public static void main(String[] args) {
        int arr[]={0,1,0,1,1,0,0};

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}

// class fib{
//     public static void main(String[] args) {
        
//        int a=0
//        int i=0;

//        for(;i<=n-1;i++){
//         fib=fib+i;

//        }
//        System.out.println("fib series of "+ n + " is "+ fib);
        
//     }
// }


//factorial
class Factorial{
    public static void main(String[] args) {
        int fact=1;
        int n=5;

        for(int i=1;i<=n;++i){
            fact=fact*i;
            
        }
        System.out.println("Factorial of "+ n +" is "+ fact);
    }
}

class fib{


    public static void main(String[] args) {
        int n=9;
        int res=fibonacci(n);
        System.out.println(res);
    }
    
    public static int fibonacci(int n){

        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        int a=0;
        int b=1;
        int res=0;

        for(int i=1;i<n;i++){
            res=a+b;
            a=b;
            b=res;
        }
        return res;
    }
}
