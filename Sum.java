/*Write a java program to sum the elements of the array using forloop: a[11,22,33,44,55]*/

import java.util.*;
import java.io.*;
public class Sum{
   public static void main(String args[]){
	int a[]={11,22,33,44,55},b=0;
	for(int i=0;i<a.length;i++){
		b=b+a[i];
	}
   System.out.println("Sum of the given array is: "+b);		
   }
}

		