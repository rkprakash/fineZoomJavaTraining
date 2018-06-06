import java.util.Scanner;

class SumOfArray{
	public static void main(String args[]){
		int[] primes = new int[5];
		//int[] odd ={1,2,3,4,5,6};
		int i=primes.length;
		int k=0,sum=0,j;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the input Values");
		for ( j=0;j<i;j++){
			primes[j] = scan.nextInt();
		}
		for (j=0;j<i;j++){
			 sum = sum+primes[j];			 
		}
		System.out.println("Sum : "+sum);
	}
}