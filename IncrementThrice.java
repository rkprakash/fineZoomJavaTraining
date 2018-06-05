import java.util.Scanner;
class IncrementThrice{
	public static void main(String args[]){
		Double inputValue,result,howTimes;		
		System.out.println("Enter the input value");
		Scanner scan = new Scanner(System.in);
		inputValue = scan.nextDouble();
		result = inputValue*3;
		System.out.println("Thrice value"+result);
	}		
}