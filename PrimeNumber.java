import java.util.Scanner;
class PrimeNumber{
    public static void main(String args[]){
		 /*
		 This Program Generate to Find The Prime Numbers
		 */
        int calculate,reminder,flag=0,i;
        Scanner given=new Scanner(System.in);
		System.out.println("Enter the Given Number :");
		int n=given.nextInt();
		   for(i=2;i<=n/2;i++)
			 {
			 reminder = n%i; 
			 if(reminder ==0){ flag =1; }
	 		 }
		   if(flag==1)
		   {
		   	System.out.println("The Given Number is NotPrime ");
		   }else 
		   {
		   	System.out.println("The Given Number is Prime ");
		   }	
    }
}