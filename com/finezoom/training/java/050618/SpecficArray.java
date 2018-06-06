import java.util.Scanner;
/**
*Write a Java program to test if an array contains a specific value. 
*/

class SpecficArray{
	public static void main(String args[]){
		Scanner scan =new Scanner(System.in);
		int inputValue[]=new int[5];
		int i,searchValue,temp=0;
		int n=inputValue.length;
		System.out.println("Enter the input Values");		
		for( i=0;i<n;i++){
			inputValue[i]=scan.nextInt();			
		}	
		System.out.println("Enter the search Values");	
		searchValue=scan.nextInt();
		for( i=0;i<n;i++){
		    if(inputValue[i]==searchValue){
				temp=1;
				break;
			}else{
				temp=2;
				
			}
		}
		if(temp==1){
			System.out.println("value found" +searchValue+","+i+"position");
		}else if(temp==2){
			System.out.println(searchValue+" value not found" );
		}
		
	}
}