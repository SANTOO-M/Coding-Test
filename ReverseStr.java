/* 1.write the java program and reverse the given string without using reverse method */

import java.util.Scanner;
public class ReverseStr{
	public static void reverseString(char ch[], int length){
	if (length>0){
	System.out.print(ch[length -1]);
	length--;
	reverseString(ch,length);
}
}
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a String to reverse: ");
	String str=sc.nextLine();
	char ch[]=str.toCharArray();
	int length=ch.length;
	reverseString(ch,length);
}
}