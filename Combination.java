import java.util.*;
public class Combination{
   static int fact(int f){
	int result=1;
	for(int i=2;i<=f;i++)
	   result=result*i;
	return result;
   }
   static int nCr(int n,int r){
	return fact(n)/(fact(r)*fact(n-r));
   }
   public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the value of n: ");
	int n=sc.nextInt();
	System.out.print("Enter the value of r: ");
	int r=sc.nextInt();
	if(n>=r)
		System.out.println("Value of "+n+"C"+r+" is= "+nCr(n,r));
	else
		System.out.println("n value should greater than or equals to r value ");
   		
   }
}