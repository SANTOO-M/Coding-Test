/*Write the java code to sum the following array locations, a[2],a[4],a[6],a[8] from the array a[12,23,34,45,56,67,78,89,90]*/

public class SumLoc{
   public static void main(String args[]){
	int a[]={12,23,34,45,56,68,78,89,90};
	int b=0;
	for(int i=2;i<a.length;i+=2)
		b=b+a[i];
   System.out.println("Sum of the array is: "+b);
  }	
}