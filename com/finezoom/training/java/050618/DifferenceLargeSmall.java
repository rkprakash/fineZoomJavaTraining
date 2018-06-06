import java.util.Scanner;

class DifferenceLargeSmall{
	public static void main(String args[]){
		Scanner scan =new Scanner(System.in);
		int inputValue[]=new int[5];
		int i,max=0,min=0;
		System.out.println("Enter the input Values");		
		for( i=0;i<inputValue.length;i++){
			inputValue[i]=scan.nextInt();
		}
		for( i=0;i<inputValue.length;i++){
			if(max < inputValue[i]){				
				max = inputValue[i];
			}	
			if(max > inputValue[i]){
				min = inputValue[i];
			}		
		}
		int Diff = max - min;
		System.out.println("Difference between max & min : "+Diff);
		
	}
}