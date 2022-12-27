public class Final{
    public static void main(String args[]){
	final int array[]={12,43,10,5,60};
	System.out.print("Final array values: ");
	for(int i:array)
		System.out.print(i+" ");
	for(int i=0;i<array.length;i++)
	   array[i]*=10;
	System.out.print("\nUpdated final array values: ");
	for(int k:array)
		System.out.print(k+" ");
		
    }
}