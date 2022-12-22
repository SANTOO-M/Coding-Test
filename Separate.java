import java.util.*;
public class Separate{
  public static void main(String args[]){
	int num=967;
	System.out.println("Split the number 967:");
	LinkedList <Integer> stack=new LinkedList <Integer>();
	while(0<num){
		stack.push(num%10);
		num=num/10;
	}
	 while(!stack.isEmpty())
	 	System.out.println(stack.pop());
  }
}