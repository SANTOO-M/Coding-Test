import java.util.*;
public class ASCII{
	static int sec,word1,word2;
	
	public static void half(String str){
		int first=0,count=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!=','){
				first+=str.charAt(i);
				count++;
			}
		else{
			sec=count;
			word1=first;
			break;
		}
		}
	
		System.out.println("ASCII value of first String: "+word1);	
	}
	public static void full(String str){
		int second=0;
		for(int j=sec+1;j<str.length();j++){
			second+=str.charAt(j);
		}
	word2=second;
	System.out.println("ASCII value of second String: "+word2);
	}
	
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter single pair of String (separate it by comma): ");
	String str=sc.nextLine();
	half(str);
	full(str);
	System.out.println("The value of (ASCII Value of second String) - (ASCII Value of first String) is= "+((word2)-(word1)));

    }
}