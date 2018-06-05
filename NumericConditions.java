import java.util.Scanner;
class NumericConditions{
	public static void main(String args[]){
		int aValue,bValue;
		System.out.println("Enter the input values:\n");
		Scanner scan = new Scanner(System.in);
		aValue = scan.nextInt();
		bValue = scan.nextInt();
		//Check the values are equal or not
		if (aValue>bValue){
			System.out.println(+aValue+"(first)greater than of"+bValue);
		}else if(aValue<bValue){
			System.out.println(+aValue+"(first)lesser than of"+bValue);
		}else{
			System.out.println("There are two numbers are equal");
		}			
	}
}