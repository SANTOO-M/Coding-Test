/*Write a program that takes a number as input and prints its
multiplication table upto 10.
	Input a number: 8
	Expected Output :
	8 x 1 = 8
	8 x 2 = 16
	8 x 3 = 24
	...
	8 x 10 = 80 */

public class Multiplication{
   public static void main(String []args){
	int number=8,mul;
	for(int i=1;i<=10;i++){
		mul=i*number;	
		System.out.println(number+" x "+i+" = "+mul);
	}
   }
}