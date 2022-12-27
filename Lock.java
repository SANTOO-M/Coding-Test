import java.util.Scanner;
public class Lock{
    public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a Lock number= ");
	int lock=sc.nextInt();
	if(1>lock||lock>100)
	    System.out.print("Lock number should be greater than zero and less than or equals to 100");
	else{
	    System.out.println("Lock number "+lock+"'s keys are: ");
	    for(int i=1;i<lock;i++){
		if(lock%i==0)
	           System.out.println(i);
	    }
	}
    }
}