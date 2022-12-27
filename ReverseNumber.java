import java.util.Scanner;
class ReverseNumber{
   public static void main(String args[]){
   Scanner obj=new Scanner(System.in);
   int num,temp,reverse=0;
   System.out.print("Enter a number to reverse: ");
   num=obj.nextInt();
   while(num>0){
	temp=num%10;
	reverse=reverse*10+temp;
 	num=num/10;
   }
   System.out.println("Reverse of a given number is: "+reverse);
}
}