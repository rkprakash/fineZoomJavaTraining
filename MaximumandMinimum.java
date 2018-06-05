import java.util.Scanner;

class MaximumandMinimum{
	public static void main(String args[]){
		Scanner scan =new Scanner(System.in);
		int inputValue[]=new int[5];
		int i,max=0,min=0;
		System.out.println("Enter the input Values");		
		for( i=0;i<inputValue.length;i++){
			inputValue[i]=scan.nextInt();
			//.out.println("Enter the input Values"+inputValue[i]);
		}
		for( i=0;i<inputValue.length;i++){
			if(max < inputValue[i]){				
				max = inputValue[i];
			}	
			if(max > inputValue[i]){
				min = inputValue[i];
			}		
		}
			System.out.println("Maximum Number :"+max);
		// for( i=0;i<inputValue.length;i++){
			// if(min > inputValue[i]){				
				// inputValue[i]=min;
			// }			
		// }
		System.out.println("Minimum Number :"+min);
	}
}