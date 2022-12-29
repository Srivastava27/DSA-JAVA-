# DSA-JAVA-
tree in DSA :
A tree data structure is defined as a collection of objects or entities known as nodes that are linked together to represent or simulate hierarchy.
A tree data structure is a non-linear data structure because it does not store in a sequential manner. It is a hierarchical structure as elements in a Tree are arranged in multiple levels.
In the Tree data structure, the topmost node is known as a root node. Each node contains some data, and data can be of any type. In the above tree structure, the node contains the name of the employee, so the type of data would be a string.
Each node contains some data and the link or reference of other nodes that can be called children.


// code for sorting

class larElement{
    public static void main(String[] args) {
        int arr[]={1,2,6,8,3,5};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){        //i=1 because we have already considered i=0(arr[0]) as max 
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("largest element found :) "+max);
    }
}
