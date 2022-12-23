/*Write a Java program to find the largest of three numbers*/
public class Largest{
   public static void main(String args[]){
	int a=230,b=230,c=230;
	if(a>=b&&a>=c)	
		System.out.println("Largest: "+a);	
	else if(b>=a&&b>=c)
		System.out.println("Largest: "+b);
	else
		System.out.println("Largest: "+c);
   }
   
}
