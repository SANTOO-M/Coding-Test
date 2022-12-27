import java.util.Scanner;
public class Armstrong{
    public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter first number: ");
	int first=sc.nextInt();
	System.out.print("Enter second number: ");
	int second=sc.nextInt();
	System.out.println("Prime numbers between "+first+" and "+second+" are: ");
	for(int i=first;i<second;i++){
		int temp=i,rem,sum=0;
		while(temp!=0){
			rem=temp%10;
			sum=sum+(rem*rem*rem);
			temp=temp/10;
		}
	if(sum==i)
		System.out.println(i);
	}
    }
} 