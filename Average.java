/*Write a Java program that takes three numbers as input to calculate and
print the average of the numbers*/

import java.util.Scanner;
public class Average{
   public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter three numbers to calculate average : ");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	double d=(a+b+c)/3d;
	System.out.println("Average is "+d);
   }
}
