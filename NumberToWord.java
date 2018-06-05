import java.util.Scanner;
class NumberToWord{
	public static void main(String args[]){
		int inputValue,tempValue,temp=0,assignValue,count=0;		
		System.out.println("Enter the input values:");
		Scanner scan = new Scanner(System.in);
		inputValue = scan.nextInt();
		assignValue = inputValue;
		while(count<inputValue){
			tempValue =  assignValue%10;
			assignValue = assignValue/10;
			if(tempValue==0 && assignValue==0){
				temp=1;
				break;
			}
			count++;
		}
		if(temp==1){
			System.out.println("Total words"+args[count]);
		}else{
			System.out.println("Total words"+args[count]);
		}
	}
}