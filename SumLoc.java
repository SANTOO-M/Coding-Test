public class SumLoc{
   public static void main(String args[]){
	int a[]={12,23,34,45,56,68,78,89,90};
	int b=0;
	for(int i=2;i<a.length;i+=2)
		b=b+a[i];
   System.out.println("Sum of the array is: "+b);
  }	
}