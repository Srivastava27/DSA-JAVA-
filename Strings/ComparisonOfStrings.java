package Strings;

class Comaprison{
    public static void main(String[] args) {
        String name1="sona";
        String name2="sona";

        //if s1>s2 : +ve value
        //if s1==s2 : 0
        //is s1<s2 : -ve value

        if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal");
        }else if(name1.compareTo(name2)>0){
            System.out.println("String1 is greater than string2");
        }else{
            System.out.println("String two is greater");
        }
    }
}