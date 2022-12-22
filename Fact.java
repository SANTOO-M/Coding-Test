/*6. java program to print the factorial of n*/

import java.util.Scanner; 
class Fact{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number to find factorial: ");
	int count=sc.nextInt();
	int fact=1;		
	for(int i=1;i<=count;i++){
		fact=fact*i;
	}
	System.out.println(count +" factorial is: "+fact);
}}