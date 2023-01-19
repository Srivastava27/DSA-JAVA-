package BinarySearch;

class TreeCUtting{
    
    public static void res(int arr[], int arr2[], int total, int machineHeight) {
        for(int i=0;i<arr.length;i++){
            // if(arr[i]==machineHeight)return 0;
            if(arr[i]>machineHeight){
                arr2[i]=arr[i]-machineHeight;
            }else{
                arr2[i]=0;
            }
        }
        for (int i : arr2) {
            System.out.println(i);
        }

        int result=0;
        for(int i=0;i<arr2.length;i++){
            result+=arr2[i];
            
        }
        System.out.println(result);

     
    }

    
    
    
    
    public static void main(String[] args) {
        int arr[]={6,5,10,9,2,4,9,5};
        int total=13;

        int arr2[]=new int[arr.length];

        int machineHeight=5;
        // int temp=res(arr, arr2, total, machineHeight);
        // System.out.println(temp);
        res(arr, arr2, total, machineHeight);
    }
}



////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class tree_cutter{
    
    public static void tern(int arr[], int total,int machineHeight) {

        int result=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=machineHeight){
                arr[i]-=machineHeight;
                result+=arr[i];
            }else{
                arr[i]=0;
            }
        }

        for (int x : arr) {
            System.out.println(x);
        }
        System.out.println(result);
    }
    
    
    
    
    public static void main(String[] args) {
        int arr[]={6,5,10,9,2,4,9,5};
        int total=13;
        int machineHeight=5;
        tern(arr, total, machineHeight);
        // int arr2[]=new int[arr.length];
    }
}


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class Tree_Cutter_Binary_Search{
    
    public static void len(int arr[], int total, int machineHeight, int res) {
        for(int i=0;i<arr.length;i++){
            
            // if(total<res[i]){
            //     res++;
               

            // }else{
            //     res--;
            // }   
            
            //  System.out.println(res);
            
            
            if(arr[i]>machineHeight){
                    res=arr[i]-machineHeight;
                    res+=res;
                    machineHeight++;
                    
            }
            // System.out.println(res);
                
                
            }
            // if(res==total)
            System.out.println("height of machine: "+machineHeight);
        }
    
    
    
    
    public static void main(String[] args) {
        int arr[]={6,5,10,9,2,4,9,5};
        int total=14;
        int machineHeight=0;
        int res=0;

        len(arr, total, machineHeight, res);
    }
}
////////////////////////--------  WITH BINARY SEARCHn --------/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

///*****finding height of the machine*****///

class cut_the_trees{
    public static void main(String[] args) {
        int tree[]={6,5,10,9,2,4,9,5};
        int total_wood=14;
        int length=tree.length;
        int res=find_height(tree, length, total_wood);
        System.out.println(res);
    }

    static int find_height(int tree[], int length, int total_wood)
    {
        int start=0;
        int end=0;
        // int machine_height=0;
        for(int i=0;i<length;i++){
            if(tree[i]>end){
                end=tree[i];
            }
        }
        
        ///////////////---wood collected-----////////////////////////
        while(start<=end){
            int wood_collected=0;
            int machine_height=(start+end)/2;
            for(int i=0;i<length;i++){
                if(machine_height<tree[i]){
                    wood_collected+=tree[i]-machine_height;
                }
            }
        
        /////////---checking whether wood collected is equal to the required total wood or not---//////    
            if(wood_collected==total_wood){
                return machine_height;
            }else if(wood_collected>total_wood){
                start=machine_height+1;
            }else{
                end=machine_height-1;
            }
        }
        return -1;
    }
}

////////////////////-----without BINARY SEARCH-------/////////////////////////////

// finding height of the machine //

class tree{
    public static void main(String[] args) {
        int tree[]={6,5,10,9,2,4,9,5};
        int total_wood=14;
        int length=tree.length;
        int res=find_height(tree, length, total_wood);
        System.out.println(res);
    }

    static int find_height(int tree[], int length, int total_wood)
    {
        int start=0;
        int end=0;
        // int machine_height=0;
        for(int i=0;i<length;i++){
            if(tree[i]>end){
                end=tree[i];
            }
        }
        for(int machine_height=start;machine_height<end;machine_height++){
            int wood_collected=0;




///////////////------height of tree which will be cut------////////////////////
            for(int i=0;i<length;i++){
                if(machine_height<tree[i]){
                wood_collected+=tree[i]-machine_height;
                }
            }



//////////////-------wood collected at that height is same then the machine height is accurate------////////////            
            if(wood_collected==total_wood){
                return machine_height;
            }

        }
        return -1;
    }
}