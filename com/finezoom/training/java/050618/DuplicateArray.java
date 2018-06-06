import java.util.Scanner;	
class DuplicateArray{
	public static void main(String args[]){
		Scanner scan =new Scanner(System.in);
		int inputValue[]=new int[5];
		//int inputValues[]=new int[5];
		int i,j,searchValue,temp=0;
		int n=inputValue.length;
		//int len=inputValues.length;
		System.out.println("Enter the input Values");		
		for( i=0;i<n;i++){
			inputValue[i]=scan.nextInt();			
		}
        
		for( i=0;i<n;i++){
			for( j=i+1;j<n;j++){
				if(inputValue[i]==inputValue[j])
				{
					System.out.println("Duplicate Array is"+inputValue[i]+", position"+i+","+j);
				}
			}
		
		}
		
		
	}
}