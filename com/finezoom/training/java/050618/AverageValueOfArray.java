import java.util.Scanner;

class AverageValueOfArray{
	public static void main(String args[]){
		int[] inputValue = new int[5];
		int i=inputValue.length;
		int k=0,sum=0,j;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the input Values");
		for ( j=0;j<i;j++){
			inputValue[j] = scan.nextInt();
		}
		for (j=0;j<i;j++){
			 sum = sum+inputValue[j];			 
		}
		System.out.println("Average:"+(sum/i));
	}
}
