/*Java program to print first 50 prime numbers*/
class Prime
{
   public static void main(String args[])
   {
     	int n=50,status=1,num=3;
        if(n>=1)
      	{
         System.out.println("First 50 prime numbers are: ");
         System.out.println(2);
      	}
      	 for (int i=2;i<=n;)
     	 {
         for(int j=2;j<=Math.sqrt(num);j++)
         {
            if(num%j==0)
            {
               status=0;
               break;
            }
         }
         if(status!=0)
         {
            System.out.println(num);
            i++;
         }
         status=1;
         num++;
      }         
   }
}