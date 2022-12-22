/* 7. java program to print the sum of digits of a number */

import java.util.Scanner;
class SumOfDigit{
	public static void main(String args[]){
		Scanner obj=new Scanner(System.in);
		System.out.print("Give a Number: ");
		int sum=0,temp,num;
		num=obj.nextInt();	
		
		while(0<num){
		temp=num%10;
		sum=sum+temp;
		num=num/10;
		}
	System.out.println("Sum of the digits of a given number: "+sum);
	}
}