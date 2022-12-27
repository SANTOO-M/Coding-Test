public class Swap{
   public static void main(String args[]){
	System.out.println("Before Swap...");
	int x=100;
	int y=200;
	System.out.println("Value of x: "+x);
	System.out.println("Value of y: "+y);
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println("After Swap...");
	System.out.println("Value of x: "+x);
	System.out.println("Value of y: "+y);
   }
}