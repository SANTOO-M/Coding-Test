/*Write a Java program to swap two variables*/

public class SwapVariable{
  public static void main(String args[]){
	int x=100,y=200,temp;
	System.out.println("Before Swap...");
	System.out.println("x="+x);
	System.out.println("y="+y);
	temp=x;
	x=y;	
	y=temp;
	System.out.println("After Swap...");
	System.out.println("x="+x);
	System.out.println("y="+y);
  }
}
