package unit_01;

import java.util.Scanner;

/*
 * When user takes input from the console:
 * 
 * nextLine()  		Read user input (to read Strings)
 * next()			Read next token from the input entered by the user
 * 
 * nextBoolean()	Read a boolean value from the user
 * nextByte()		Read a byte value from the user
 * nextDouble()	    Read a double value from the user
 * nextFloat()	    Read a float value from the user
 * nextInt()		Read a int value from the user
 * nextLine()		Read a string value from the user
 * nextLong()		Read a Long value from the user
 * nextShort()		Read a Short value from the user
 */

public class P4_Task03_ScannerClassInJava {

	public static void main(String[] args) {
		
			Scanner myObj1=new Scanner(System.in); //create a scanner object
			Scanner myObj2=new Scanner(System.in);
			
			//Read the First-Token : (_ space_bar)
			String firstName= myObj1.next();
			System.out.println("Name is: "+firstName+"\n");
			
			String name=myObj2.nextLine(); //(\n)
			String name2=myObj2.nextLine(); //(\n)
			
			System.out.println("Name is: "+name+"\n");
			System.out.println("Name is: "+name2+"\n");
			
			boolean b=myObj2.nextBoolean();
			System.out.println(b+"\n");
			
			myObj1.close();
			myObj2.close();
	}

}
