package unit_01;

/*
	* The wrapper class in Java provides the mechanism 
	* to convert primitive into object and object into primitive.

	*Since J2SE 5.0, 
	*autoboxing and unboxing feature convert primitives into objects and 
	*objects into primitives automatically. 
	*The automatic conversion of primitive into an object 
	*is known as autoboxing and vice-versa unboxing.
 */

public class P4_Task02_WrapperClassesInJava {

	public static void main(String[] args) {
		
		//converting int to Integer
		int a=20;
		String s=""+a+"";
		
		Integer i = Integer.valueOf(a); //converting int to integer explicitly
		Integer j = a; //autoboxing, now compiler will write Integer.valueOf(a) internally
		
		System.out.println(a+" "+i+" "+j);
		
		System.out.println(i.toString());
		
		//a.toString can not be done due to a is int not object
		
		//Autoboxing Converting primitives to Objects
		byte b =10;
		Byte byteobj=b;
		
		System.out.println(byteobj);
		
		//Unboxing Converting Objects to Primitives
		byte bytevalue=byteobj;
		System.out.println(bytevalue);

	}

}
