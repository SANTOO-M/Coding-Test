/* 5.write a java program to print the three armstrong numbers*/

import java.util.Scanner;
public class Armstrong{
public static void main(String []args){
	Scanner sc=new Scanner(System.in);
	int sum=0,rem,temp;
	System.out.print("Enter 3 digit integer: ");
	int num=sc.nextInt();
	temp=num;
	while(num>0){
		rem=num%10; 	 
		num=num/10;  	 
		sum=(rem*rem*rem)+sum;  
		}
	if(temp==sum)
		System.out.println("It's an Armstrong number");
	else
		System.out.println("It's not an Armstrong number");
	}}