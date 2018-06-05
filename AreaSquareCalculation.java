import java.util.Scanner;
class AreaSquareCalculation{
	public static void main(String args[]){
		Double area,side;		
		System.out.println("Enter the side value");
		Scanner scan = new Scanner(System.in);
		side = scan.nextDouble();
		area = side*side;
		System.out.println("Area of square :"+area);
	}		
}