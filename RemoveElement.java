/*Write a java program to remove a specific number: 23 from the following array:
arr[11,22,33,34,43,32, 23]*/

import java.util.Arrays;
public class RemoveElement{
    public static void main(String args[]){
	int arr[]={11,22,33,34,43,32, 23},index=6;
	int[] copyArr=new int[arr.length-1];
	System.out.println("Original Array: " + Arrays.toString(arr));
	for(int i=0,k=0;i<arr.length;i++){
	   if(i==index)
		continue;
	   else
		copyArr[k++]=arr[i];
	}
 	System.out.println("After the removal of element '23' :"+Arrays.toString(copyArr));
	
	}
  }
