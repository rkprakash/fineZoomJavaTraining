import java.util.Scanner;
/**
* Common value of two integer
*/
class CommonInteger{
	public static void main(String args[]){
		Scanner scan =new Scanner(System.in);
		int inputValue[]=new int[5];
		int inputValues[]=new int[5];
		int i,j,searchValue,temp=0;
		int n=inputValue.length;
		int len=inputValues.length;
		System.out.println("Enter the input Values");		
		for( i=0;i<n;i++){
			inputValue[i]=scan.nextInt();			
		}
        System.out.println("Enter the input Values");		
		for( j=0;j<n;j++){
			inputValues[j]=scan.nextInt();			
		}
		
		for( i=0;i<n;i++){
			for( j=0;j<n;j++){
				if(inputValue[i]==inputValues[j])
				{
					//temp=1;
					System.out.println("Common elements"+inputValue[i]+","+inputValues[j]);
				}
			}
		
		}
		
		
	}
}