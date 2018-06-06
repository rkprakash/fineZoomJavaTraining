import java.util.Scanner;

class RemoveElement{
	public static void main(String args[]){
		
		Scanner scan =new Scanner(System.in);
		int[] inputValue=new int[5];
		int remValue,i=0,k=0;
		k=inputValue.length;
		System.out.println("Enter the input value");
		for(i=0;i<k;i++){
			inputValue[i] = scan.nextInt();			
		}
		System.out.println("Enter the remove position");
		remValue = scan.nextInt();
		System.out.println("After the remove element");
		for( i=0;i<k;i++){
			if(i==remValue){
				inputValue[i] = inputValue[i+1] ;
				i++;
			}		
			System.out.println(inputValue[i]);
		}
	}
}