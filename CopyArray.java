/*Write a java program to copy the array values to another array in reverse 
order as If arr1[1,2,3,4,5] the resultant array should be arr2[5,4,3,2,1]*/

import java.util.Arrays;
public class CopyArray{
   public static void main(String args[]){
	int arr1[]={1,2,3,4,5};
	int arr2[]= new int[arr1.length];
	for(int i=0,k=arr1.length-1;i<arr1.length;i++){
	    arr2[k--]=arr1[i];
	}
	System.out.println("Original array: "+Arrays.toString(arr1));
	System.out.println("Copy of Original array in reverse order: "+Arrays.toString(arr2));
   }
}
