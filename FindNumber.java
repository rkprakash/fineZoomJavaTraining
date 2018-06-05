import java.util.Scanner;

class FindNumber{
	public static void main(String args[]){
		Scanner scan =new Scanner(System.in);
		int inputValue[]=new int[5];
		int findValue,k=0,i;
		System.out.println("Enter the input Values");
		
		for( i=0;i<inputValue.length;i++){
			inputValue[i]=scan.nextInt();
		}
		System.out.println("Enter the find number:");
		findValue=scan.nextInt();
		for( i=0;i<inputValue.length;i++){
			if(i==findValue){
				k=1;
				break;
			}
		}
		if(k==1){
			System.out.println("Find the position"+inputValue[i]);
		}else {
			System.out.println("sorry");
		}
		
		
	}
}


