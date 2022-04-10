package unit_01;

public class P5_Task02_MethodsInJava {

	public static void main(String[] args) {
		ABC3 obj= new ABC3();
		
		//calling display method definition
		obj.display();
		System.out.println(obj.display2());

	}

}

class ABC3
{
	int a = 10;
	
	/*
	 * Actual method definition
	 * 
	 * DataType methodName (DataType2 p1, DataType2 p2)
	 * 
	 * methodBody;
	 * 
	 * return value; //if required
	 * 
	 */
	
	static void display()
	{
		int b=10;
		int a =10;
		System.out.println(b);
		System.out.println(a);
	}
	
	int display2()
	{
		System.out.println(a);
		return a;
	}
}