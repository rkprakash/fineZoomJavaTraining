import java.util.Scanner;
/*
*
*/
public class EmployeeMultipleSalary{
	
	
	public static void main(String args[]){
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the Employee Name : ");
		String empName = scan.next();
		System.out.println("Employee last five month salary");
		int empFirMonSal = scan.nextInt();
		int empSecMonSal = scan.nextInt();
		int empTrdMonSal = scan.nextInt();
		int empFurMonSal = scan.nextInt();
		int empFveMonSal = scan.nextInt();
		int percentage;
		//Sum of Salary
		int sumEmpSalary  = empFirMonSal+empSecMonSal+empTrdMonSal+empFurMonSal+empFveMonSal;
		System.out.println("Total salary :"+sumEmpSalary);
		//Average of salary
		int avgEmpSalary = sumEmpSalary/5;
		System.out.println("Average salary :"+avgEmpSalary);
		// maximum of salary
		    if((empFirMonSal>empSecMonSal)&&(empFirMonSal>empTrdMonSal)&&(empFirMonSal>empFurMonSal)&&(empFirMonSal>empFveMonSal))
				{
					System.out.println("First Month salary higher than another month");
					
				}
			else if((empSecMonSal>empTrdMonSal)&&(empSecMonSal>empFurMonSal)&&(empSecMonSal>empFveMonSal))
				{
					System.out.println("Second Month salary higher than another month");
					
				}
			else if((empTrdMonSal>empFurMonSal)&&(empTrdMonSal>empFveMonSal))
				{
					System.out.println("Third Month salary higher than another month");
					
				}
			else if((empFurMonSal>empFveMonSal))
				{
					System.out.println("four Month salary higher than another month");
					
				}
			else 
				{
					System.out.println("five Month salary higher than another month");
					
				}			
		//minimum
            if((empFirMonSal<empSecMonSal)&&(empFirMonSal<empTrdMonSal)&&(empFirMonSal<empFurMonSal)&&(empFirMonSal<empFveMonSal))
				{
					System.out.println("First Month salary smaller than another month");
					
				}
			else if((empSecMonSal<empTrdMonSal)&&(empSecMonSal<empFurMonSal)&&(empSecMonSal<empFveMonSal))
				{
					System.out.println("Second Month salary smaller than another month");
				}
			else if((empTrdMonSal<empFurMonSal)&&(empTrdMonSal<empFveMonSal))
				{
					System.out.println("Third Month salary smaller than another month");
				}
			else if((empFurMonSal<empFveMonSal))
				{
					System.out.println("four Month salary smaller than another month");
				}
			else 
				{
					System.out.println("five Month salary smaller than another month");
				}
		//Increment & Decrement
			System.out.println("Choose you choice \n1:Increase by percentage\n2Increase by amount\n3:Decrease by percentage\n4:Decrease by amount");
			int choice=scan.nextInt();
			int amount;				
            switch(choice){
				case 1:
			        System.out.println("Enter the gievn percentage");
	                percentage=scan.nextInt();
	                System.out.println("First Month salary:"+empFirMonSal);
	                empSecMonSal=((percentage*empFirMonSal)/100)+empFirMonSal;
	                System.out.println("After increment second month salary:"+empSecMonSal);
	                empTrdMonSal=((percentage*empSecMonSal)/100)+empSecMonSal;
	                System.out.println("After increment Third month salary:"+empTrdMonSal);
	                empFurMonSal=((percentage*empTrdMonSal)/100)+empTrdMonSal;
	                System.out.println("After increment fourth month salary:"+empFurMonSal);
	                empFveMonSal=((percentage*empFurMonSal)/100)+empFurMonSal;
	                System.out.println("After increment fiveth month salary:"+empFveMonSal);
                    break;
				case 2:	
					System.out.println("Enter the gievn amount");
	                amount=scan.nextInt();
	                System.out.println("First Month salary:"+empFirMonSal);
	                empSecMonSal=amount+empFirMonSal;
	                System.out.println("After increment second month salary:"+empSecMonSal);
	                empTrdMonSal=amount+empSecMonSal;
	                System.out.println("After increment Third month salary:"+empTrdMonSal);
	                empFurMonSal=amount+empTrdMonSal;
	                System.out.println("After increment fourth month salary:"+empFurMonSal);
	                empFveMonSal=amount+empFurMonSal;
	                System.out.println("After increment fiveth month salary:"+empFveMonSal);
                    break;	
				case 3:
					System.out.println("Enter the gievn percentage");
					percentage=scan.nextInt();
					System.out.println("First Month salary:"+empFirMonSal);
					empSecMonSal=empFirMonSal-((percentage*empFirMonSal)/100);
					System.out.println("After decrement second month salary:"+empSecMonSal);
					empTrdMonSal=empSecMonSal-((percentage*empSecMonSal)/100);
					System.out.println("After decrement third month salary:"+empTrdMonSal);
					empFurMonSal=empTrdMonSal-((percentage*empTrdMonSal)/100);
					System.out.println("After decrement fourth month salary:"+empFurMonSal);
					empFveMonSal=empFurMonSal-((percentage*empFurMonSal)/100);
					System.out.println("After decrement fiveth month salary:"+empFveMonSal);
					break;
				case 4:	
					System.out.println("Enter the gievn amount");
	                amount=scan.nextInt();
	                System.out.println("First Month salary:"+empFirMonSal);
	                empSecMonSal=empFirMonSal-amount;
	                System.out.println("After increment second month salary:"+empSecMonSal);
	                empTrdMonSal=empSecMonSal-amount;
	                System.out.println("After increment Third month salary:"+empTrdMonSal);
	                empFurMonSal=empTrdMonSal-amount;
	                System.out.println("After increment fourth month salary:"+empFurMonSal);
	                empFveMonSal=empFurMonSal-amount;
	                System.out.println("After increment fiveth month salary:"+empFveMonSal);
                    break;
                default:
                    System.out.println("Please correct input");				
			}
			//Decrement
			
	           
		//Ascending order
		int totMonth,temp;
		for(totMonth=0;totMonth<5;totMonth++)
		{
			if(empFirMonSal>empSecMonSal){
				temp = empFirMonSal;
				empFirMonSal = empSecMonSal;
				empSecMonSal = temp;
			}
			if(empSecMonSal>empTrdMonSal){
				temp = empSecMonSal;
				empSecMonSal = empTrdMonSal;
				empTrdMonSal = temp;
			}
			if(empTrdMonSal>empFurMonSal){
				temp = empTrdMonSal;
				empTrdMonSal = empFurMonSal;
				empFurMonSal = temp;
			}
			if(empFurMonSal>empFveMonSal){
				temp = empFurMonSal;
				empFurMonSal = empFveMonSal;
				empFveMonSal = temp;
			}
		}
		System.out.println("Ascending order:"+empFirMonSal+","+empSecMonSal+","+empTrdMonSal+","+empFurMonSal+","+empFveMonSal);
		//Descending order
		for(totMonth=0;totMonth<6;totMonth++)
		{
			if(empFirMonSal<empSecMonSal){
				temp = empFirMonSal;
				empFirMonSal = empSecMonSal;
				empSecMonSal = temp;
			}
			if(empSecMonSal<empTrdMonSal){
				temp = empSecMonSal;
				empSecMonSal = empTrdMonSal;
				empTrdMonSal = temp;
			}
			if(empTrdMonSal<empFurMonSal){
				temp = empTrdMonSal;
				empTrdMonSal = empFurMonSal;
				empFurMonSal = temp;
			}
			if(empFurMonSal<empFveMonSal){
				temp = empFurMonSal;
				empFurMonSal = empFveMonSal;
				empFveMonSal = temp;
			}
		}
		System.out.println("Descending order:"+empFirMonSal+","+empSecMonSal+","+empTrdMonSal+","+empFurMonSal+","+empFveMonSal);
		
			
		
	}   
}