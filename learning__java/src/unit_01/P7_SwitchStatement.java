package unit_01;
import java.util.Scanner;

/* Problem Statement: P7_SwitchStatements: 
Create a switch statement [Manual], In Which:
	 a. When you pass 1 your program would print current year
	 b. When you pass 2 your program would print current month
	 c. When you pass 3 your program would print current day
	 d. When you pass 4 your program would print Not applicable 
* */

public class P7_SwitchStatement {

	public static void main(String[] args) {
		
		SwitchStatements obj = new SwitchStatements();
		obj.switchStatements();

	}

}

class SwitchStatements {
	void switchStatements() {
		
		System.out.println("MENU");
		System.out.println("1.Current Year");
		System.out.println("2.Current Month");
		System.out.println("3.Current Day");
		
		int choice;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter choice:");
		choice=input.nextInt();
		
		switch(choice)
		{
			case 1:
			{
				System.out.println("Current year: 2022");
				break;
			}
			
			case 2:
			{
				System.out.println("Current month: April");
				break;
			}
			
			case 3:
			{
				System.out.println("Current Day: Sunday");
				break;
			}
			
			default:
			{
				System.out.println("Invalid Choice");
			}
		}
		
		input.close();
		
	}
}
