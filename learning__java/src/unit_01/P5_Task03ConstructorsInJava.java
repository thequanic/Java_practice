package unit_01;


/*
 * Constructor is called when an instance of the class is created
 * At the time of calling of the constructor, memory for the object is allocated in te memory
 * It is a special type of method Java
 * 	-Parameterized Constructor
 *  -Default Constructor
 *  
 */
public class P5_Task03ConstructorsInJava {

	public static void main(String[] args) {
		
		ABC4 obj= new ABC4();
		ABC4 obj1= new ABC4(1);
		
		System.out.println(obj.a);
		System.out.println(obj1.a);

	}

}


class ABC4
{
	int a;

	ABC4()
	{
		a=10;
	}
	
	ABC4(int a)
	{
		this.a=a;
	}
	
	void display()
	{
		int b=10;
		System.out.println(a);
		System.out.println(b);
		
	
	}
}


