//Write a java program to find whether the given number is prime or not.

import java.util.Scanner;
class PrimeOrNot{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		boolean boo=false;
		System.out.print("Enter a Number to find prime or not: ");
		int num=sc.nextInt();
		for(int i=2;i<=num/2;++i){
			if(num%i==0){
				boo=true;
				break;
			}
		}
		if(boo)
		   System.out.println("not Prime");
		else
		   System.out.println("Prime");	
	
	}
}