import java.util.Scanner;
class ArmstrongCondition{
	public static void main(String args[]){
		System.out.println("Enter the input values:");
		Scanner scan = new Scanner(System.in);
		int aValue,temp=0,i=0,j=0,assignValue,count;
        aValue = scan.nextInt();
        assignValue = aValue;
		String lenthValue=Integer.toString(aValue);
		//System.out.println("Output:"+lenthValue);
		count = lenthValue.length();
		while(i<aValue){			
			j = assignValue%10;
			assignValue = assignValue/10;
			temp=(int)(temp+Math.pow(j,count));
			i++;
		}
		//System.out.println("Output:"+count);		
		if(aValue == temp){
			System.out.println("Given number is Armstrong");
		}else {
			System.out.println("Given number is Not Armstrong");
		}
	}
	
}