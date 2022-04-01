package unit_01;


//Write a java program to demostrate constants in java

public class P2_Task02_ConstantsInjava {
	
	public static final double Pi=3.14; //use final keyword to declare constant variables
										

	public static void main(String[] args) {
		//we can only use static members in static functions
		System.out.println(Pi);
		main("hello");
		
		NewClass obj = new NewClass();
		obj.add(1,2);
		System.out.println(obj.Pi);

	}
	
	public static void main(String args)
	{
		//main function overloaded
		System.out.println(Pi);
	}
	
	void add(int a, int b)
	{
		System.out.println(a+b);
		System.out.println(Pi);
	}

}



class NewClass
{
	final double Pi=3.14;
	void add(int a, int b)
	{
		System.out.println(a+b);
		System.out.println(P2_Task02_ConstantsInjava.Pi);
	}
}