package unit_01;

public class P5_Task01_ClassAndObjectInJava {

	public static void main(String[] args) {
		
		ABC2 obj = new ABC2();
		
		obj.display2();
		obj.display();

	}

}

class ABC2
{
	int a=10;
	static int b=10;
	
	static void display()
	{
		int b=10;
		b++;
		
		System.out.println(b);
	}
	
	void display2()
	{
		System.out.println(a);
	
	}
}


