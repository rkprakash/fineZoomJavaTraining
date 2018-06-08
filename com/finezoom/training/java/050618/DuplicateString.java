import java.util.Scanner;

public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputValue[] = new String[5];
		Scanner scan =new Scanner(System.in);
		
		int i=0,k=0,temp=0;
				k=inputValue.length;
		
		System.out.println("Enter the input value");
		for(i=0;i<k;i++){
			inputValue[i] = scan.next();			
		}
		
		System.out.println("Duplicate value");
		for( i=0;i<k;i++){
			for(int j=i+1;j<k;j++){
				if(inputValue[i]==inputValue[j])
				{
					System.out.println("Duplicate Array is"+inputValue[i]);
				}else{
					System.out.println("Duplicate  is"+inputValue[i]);
				}
			}
		
		}

	}

}
