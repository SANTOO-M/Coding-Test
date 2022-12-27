import java.util.Scanner;
public class Fibonacci{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number to find fibonacci series:");
	int count=sc.nextInt();
	int x1=0,x2=1,x3;
	System.out.print("Fibonacci series of "+count+" is: "+x1+" "+x2);
	for(int i=2;i<count;i++)
	{
	   x3=x1+x2;
	   System.out.print(" "+x3);
	   x1=x2;
	   x2=x3;
	}
	}
}