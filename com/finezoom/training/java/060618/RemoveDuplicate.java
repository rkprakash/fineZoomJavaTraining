import java.util.Scanner;
/**
* Remove the duplicate array element
*/

class RemoveDuplicate{
	public static void main(String args[]){
	Scanner scan =new Scanner(System.in);
	int[] inputValue=new int[5];
	int remValue=0,i=0,k=0,j=0;
	k=inputValue.length;
	System.out.println("Enter the input value");
	for(i=0;i<k;i++){
		inputValue[i] = scan.nextInt();			
	}
//	System.out.println("Enter the remove position");
//	remValue = scan.nextInt();
	for( i=0;i<k;i++){
		for( j=i+1;j<k;j++){
			if(inputValue[i]==inputValue[j])
			{
				remValue = inputValue[j];
			}
		}
	
	}
	System.out.println("After the remove element");
	for( i=0;i<k;i++){
		if(remValue==inputValue[i]){
			inputValue[i] = inputValue[i+1] ;
			i++;
		}		
		System.out.println(inputValue[i]);
	}
	
   }
}