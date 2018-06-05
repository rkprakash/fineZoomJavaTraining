import java.util.Scanner;
class BodyMassIndex{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Name : ");
		String inputName = scan.next();
		Double height,weight,resulBmi,heightCm;
		System.out.println("Enter Your Weight : ");
		weight = scan.nextDouble();
		System.out.println("Enter Your Height(Meter) : "); //Meter
		height = scan.nextDouble();
		System.out.println("Enter Your Height(Centimeter) : "); //Centimeter
		heightCm = scan.nextDouble();
		resulBmi = (weight/Math.pow(height,2));
		System.out.println("Your BMI is :"+resulBmi);
		resulBmi = (weight*10000)/(Math.pow(heightCm,2));
		System.out.println("Your BMI is :"+resulBmi);
	}
}