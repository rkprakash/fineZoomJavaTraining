import java.util.Scanner;
class DigitAddition{
	public static void main(String args[]){
		System.out.println("Enter the input values:");
		Scanner scan = new Scanner(System.in);
		int inputValue,temp=0,condValue=0,reminderValue=0,assignValue;
        inputValue = scan.nextInt();
        assignValue = inputValue;
		while(condValue<inputValue){			
			reminderValue = assignValue%10;
			assignValue = assignValue/10;
			temp=temp+reminderValue;
			condValue++;
		}
		System.out.println("Output:"+temp);
	}
}