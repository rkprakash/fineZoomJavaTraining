import java.util.Scanner;
class IdentifyQuotiantReminder{
	public static void main(String args[]){
		int aValue,bValue,reminder,quotient;
		System.out.println("Enter the input values");
		Scanner scan = new Scanner(System.in);
		aValue = scan.nextInt();
		bValue = scan.nextInt();
		reminder = aValue%bValue;
		quotient = aValue/bValue;
		System.out.println("Reminder value of"+reminder);
		System.out.println("Quotient value of"+quotient);
	}
}