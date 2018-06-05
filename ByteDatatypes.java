import java.util.Scanner;

  //Byte - input size -128 to 127
   
class ByteDatatypes{
	public static void main(String args[]){
		byte aValue,bValue,result;
		System.out.println("Enter the input values:\n");
		Scanner scan = new Scanner(System.in);
		aValue = scan.nextByte();
		bValue = scan.nextByte();
		result =(byte) (aValue+bValue);
		System.out.println("Byte operation is:"+result);
	}
}