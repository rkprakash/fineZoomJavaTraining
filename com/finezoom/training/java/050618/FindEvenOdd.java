import java.util.Scanner;
/**
* Find the number of odd & even
*/
class FindEvenOdd{
	public static void main(String args[]){
		int n;
		Scanner scan=new Scanner(System.in);		
		System.out.println("Enter the number of terms:");
		n=scan.nextInt();
		int[] inputValue=new int[n];       // n size of array
		int i,len,count=0,temp=0;
		//len=inputValue.length;
				
		
		System.out.println("Enter the number ");
		for(i=0;i<n;i++){
			inputValue[i]=scan.nextInt();
		}
		for(i=0;i<n;i++){
			if(inputValue[i]%2==0){
				System.out.println("EVEN:"+inputValue[i]);
				count = count+1;
			}else{
				System.out.println("ODD:"+inputValue[i]);
				temp = temp+1;
			}
		}
		System.out.println("EVEN:"+count);
		System.out.println("ODD:"+temp);
	}
}