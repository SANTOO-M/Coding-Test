/*Write a java program to check the given array for the number: 56, if it is available print the array location of the number. 
Given arrays are:
ar1[12,23,34,45,56,67,78,89], ar2[56,45,34,23,12,67,78,89], ar3[45,78,78,89,56,56]*/

class FindIndex{
   public static int findIndex(int[]arr,int t){
        if(arr==null) 
	return -1;
        int len=arr.length;
        int i=0;
        while(i<len){
	    if(arr[i]==t) 
		return i;
            else
		i=i+1;
        }
        return -1;
    }
    public static void main(String[] args) {
	int[] ar1={12,23,34,45,56,67,78,89}; 	
	int[] ar2={56,45,34,23,12,67,78,89};
	int[] ar3={45,78,78,89,56,56};
	System.out.println("Element '56' presents in "+findIndex(ar1,56)+"th index position in ar1 array");
      	System.out.println("Element '56' presents in "+findIndex(ar2,56)+"th index position in ar2 array");
       	System.out.println("Element '56' presents in "+findIndex(ar3,56)+"th index position in ar3 array");
	}
}
