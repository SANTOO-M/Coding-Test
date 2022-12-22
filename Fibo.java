/* 4. write the java program to print first 15 fibonacci numbers*/

public class Fibo{
	public static void main(String args[]){
	int x1=0,x2=1,count=15,x3;
	System.out.print("First 15 fibonacci Numbers are: "+x1+" "+x2);
	for(int i=2;i<count;i++)
	{
		x3=x1+x2;
		System.out.print(" "+x3);
		x1=x2;
		x2=x3;	
	}
}
}
