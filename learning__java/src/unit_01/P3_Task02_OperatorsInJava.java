package unit_01;


//write a program to demostrate diffrent operators in java


public class P3_Task02_OperatorsInJava {

	public static void main(String[] args) 
	{
		OperatorsInJava obj1 = new OperatorsInJava();
		

	}

}

class OperatorsInJava
{
	void UnaryOperators()
	{
		int a = 10;
		boolean b = false;
		System.out.println("Inside UnaryOperators");
		System.out.println(a++);  //10 //post-increment operator
		System.out.println(a--);  //11 //post-decrement operator
		System.out.println(++a);  //11 //pre-increment operator
		System.out.println(--a);  //10 //pre-decrement operator
		
		/*
		 * Bitwise Complement (~)
		 * This unary operator returns the one's complement representation of the input value
		 * with all bits inverted, which means it makes every 0 to 1 and every 1 to 0
		 */
		
		System.out.println(~a); //  
		
	}
}
