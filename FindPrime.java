import java.util.Scanner;
class FindPrime{
//public static void main(String args[]){
	{
int calculate,reminder=0,temp,flag=0,i;
Scanner given=new Scanner(System.in);
System.out.println("Enter the Given Terms :");
// System.out.println("Enter the Given Number :");
// int n=given.nextInt();
int T=given.nextInt();
for(int j=2;j<T;j++){
for(i=2;j<T/2;i++)
	{
       temp = j%i; 
	   if(temp ==0)
	   {
		   flag = 1;
	   } 
	   temp=0;
	}
	if(flag ==1){
		System.out.println(j);
	}
}
		
}
}