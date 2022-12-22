/* 10. java program to sum the array values and pint the result*/

import java.util.*;
class SumArray{
	static int arr[]={1,3,5,9};
	static int sum(){
		int i,sum=0;	
		for(i=0;i<arr.length;i++){
		sum+=arr[i];
		}
	return sum;
	}
	public static void main(String args[]){
	System.out.println("The sum of the given array is: "+sum());
	}
}