//com.finezoom.training.java.050618;
import java.util.Scanner;

class SecondLargest{
	public static void main(String args[]){
		
		Scanner scan =new Scanner(System.in);
		int[] inputValue=new int[5];
		int i=0,j=0,k=0,max=0,min=0;
		k=inputValue.length;
		System.out.println("Enter the input value");
		for(i=0;i<k;i++){
			inputValue[i] = scan.nextInt();
			
		}
		for( i=0;i<k;i++){
			for( j=i+1;j<k;j++){			
			if(inputValue[i]>inputValue[j]){				
				max = inputValue[i];		
                inputValue[i]=inputValue[j];
                 inputValue[j]=max;				
				}						
			}			
		}
		//System.out.println("Second Largest Number:"+inputValue[j]);
		
		for( i=0;i<=k-1;i++){
			if(k-2==i){
				System.out.println("Second Largest Number :"+inputValue[i]);
			}
			 
		 }
		//System.out.println("Decending order :");
		
			
	}
}