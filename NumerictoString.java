import java.util.Scanner;
public class NumerictoString{
	public static void main(String args[]){
		System.out.println("Enter your Choice");
		Scanner scan =new Scanner(System.in);
		int choice = scan.nextInt();
		String storeValue = "ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN";
		System.out.println(storeValue[0]);
		/*for(int i=0;i<=5;i++){
			System.out.println(args[i]);
		}*/
		// switch(choice){
			// case 1:
			// System.out.println(args[1]);
			// break;
			// case 2:
			// System.out.println(args[2]);
			// break;
			// case 3:
			// System.out.println(args[3]);
			// break;
			// case 4:
			// System.out.println(args[4]);
			// break;
			// case 5:
			// System.out.println(args[5]);
			// break;
			// default:
			// System.out.println(args[0]);		
			// break;
		// }
	}
}