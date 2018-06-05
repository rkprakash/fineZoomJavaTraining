import java.util.Scanner;

class ReverseNumber{
	public static void main(String args[]){
		int inputValue,assignValue,reminder=0,conValue=0;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the given number");
		inputValue = scan.nextInt();
		assignValue=inputValue;
		while(conValue<assignValue){
			reminder = assignValue % 10;
			assignValue = assignValue /10;
			System.out.print(reminder);
		}
	}
}