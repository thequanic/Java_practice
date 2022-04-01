package unit_01;


/*
 * Variable in Java is a data container that saves the data values during Java program executed
 
 * there are three types of variables in java 
 * 1. local variables : declared inside method 
 * 2. static variable : declared under class and can be accessed using class name
 * 3. instance variable : declared under class. it belongs to object and accessed using object name,
 * 
 */

//write a java Program to demonstrate types of variables in Java, implement different data types
//and demonstrate type conversion and type casting 


public class P3_Task01_VariablesAndDataTypesInJava {

	public static void main(String[] args) 
	{
		
		
		//how to declare variable in java: valid declarations
		
		int a,b,c;   //local variables
		float pi;
		double d;
		char e;
		
		//how to initialise variable in java: Valid Initialisations
		pi=3.14f;
		d=20.22d;
		e='v';
		
		a=10;
		b=10;
		c=10;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(pi);
		System.out.println(d);
		System.out.println(e);
		
		
		//different data types
		int myNum = 5; 			//integer (whole number)
		float myFloatNum=5.99f; //floating point number
		char myLetter='D'; 		//character
		boolean myBool= true; 	//Boolean 
		String myText ="hello"; //string
		byte myByte=10;				//byte
		long myLong = 10L;			//long
		
		
		
		System.out.println(myNum);
		System.out.println(myFloatNum);
		System.out.println(myLetter);
		System.out.println(myBool);
		System.out.println(myText);
		System.out.println(myByte);
		System.out.println(myLong);
		
		/*
		 * Java Variables Type Conversion & Type casting 
		 */
		
		double f;
		int i=10;
		f=i;  		//Example of Type Conversion
		
		double g=10;
		int j;
		j = (int)g; //Example of Type Casting
		
		System.out.println(f);
		System.out.println(i);
		System.out.println(g);
		System.out.println(j);
		
		
		
		System.out.println(ABCD.j); //using static variables of class ABC
		
		ABCD obj1 = new ABCD();
		System.out.println(obj1.i); //instance variables of object obj1
		
		ABCD obj2 = new ABCD();
		System.out.println(obj2.i); //instance variables of object obj2
		
		ABCD.print();
		
	

	}
	
	int r=10; //instance variable
	
	void display()
	{
		int a = 5;  //local variable
		System.out.println("This is Display method");
		System.out.println(a);
		
	}

}

class ABCD
{
	static int j=10;  //class variable/static variable
	
	int i=10; 		  //instance variable
	
	void display()
	{
		int a = 5;  //local variable //this variable is not accessable in main method 
		System.out.println("This is Display method");
		System.out.println(a);
		
	}
	
	static void print()   //static method
	{
		System.out.println("hello");
	}
}
