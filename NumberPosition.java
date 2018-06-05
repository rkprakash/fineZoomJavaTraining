import java.util.Scanner;
class NumberPosition{
	public static void main(String args[]){
		int inputValue,tempValue,temp=0,assignValue,count=1,position;
		System.out.println("Enter the input values:");
		Scanner scan = new Scanner(System.in);
		inputValue = scan.nextInt();
		System.out.println("Position Value");		
		position = scan.nextInt();
		assignValue = inputValue;
		while(count<inputValue){
			tempValue =  assignValue%10;
			assignValue = assignValue/10;
			if(position==tempValue ){
				temp=1;
				break;
			}
			count++;
		}
		if(temp==1){
			System.out.println("The given position"+args[count]);
		}else{
			System.out.println("Sorry please correct input values");
		}
	}
}