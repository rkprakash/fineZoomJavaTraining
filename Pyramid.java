import java.util.Scanner;

public class Pyramid {
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		int aNumber,bNumber,cNumber;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the given size\n");
		int num = scan.nextInt();
		System.out.println("Enter the charactor\n");
		String name = scan.next();				
		for (aNumber = 0; aNumber < num; aNumber++) {
			
			for (bNumber = 0; bNumber <= aNumber; bNumber++) {
				
				System.out.print(name + "\t");
			}
			
			System.out.println("\n");
			
		}

		cNumber = num;

		for (aNumber = 0; aNumber < num; aNumber++) {

			for (bNumber = 0; bNumber < cNumber; bNumber++) {

				System.out.print(" ");
			}

			cNumber = cNumber - 1;

			for (bNumber = 0; bNumber <= aNumber*2; bNumber++) {				
				System.out.print(name);
			System.out.print(" ");
			}

			System.out.println();
		}
	}
}