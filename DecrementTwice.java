import java.util.Scanner;
/*
*
*/
class DecrementTwice{
	public static void main(String args[]){
		Double inputValue,result;		
		System.out.println("Enter the input value");
		Scanner scan = new Scanner(System.in);
		inputValue = scan.nextDouble();
		result = (inputValue)-(inputValue/2);
		System.out.println("Result of"+result);
	}
}