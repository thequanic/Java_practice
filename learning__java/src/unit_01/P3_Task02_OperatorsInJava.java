package unit_01;


//write a program to demonstrate different operators in java


/*
#Operator in java is a symbol that is used to perform operations.
 sum= a+b;
 For example: +,-,*,/,etc.
 ->a+=1; // a = a + 1;
 #Types of operators in java
 - Unary operator:                     {prefix and post-fix }{a++,++a,a--,--a,~a,!a }
 -Arithmetic Operator:                  {* / % + -}
 -Shift Operator:                       {<< >>}
 -Relational operator:                  {< > <= >= == !=}
 -Bitwise operator:                     {& ^ |}
 -Logical operator:                     {&& ||}
 -Ternary operator:                     {? :}
 -Assignment operator:                  {= += -= /= %= &= ^= |= <<= >>= >>>=2}
*/

public class P3_Task02_OperatorsInJava {

	public static void main(String[] args) 
	{
		OperatorsInJava obj1 = new OperatorsInJava();
		obj1.UnaryOperators();
		obj1.ArthmethicOperators();
		obj1.ShiftOperators();
		obj1.RelationalOperators();
		obj1.LogicalOperators();
		obj1.BitwiseOperators();
		obj1.TernaryOperator();
		obj1.AssignmentOperators();

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
		 * This unary operator returns the one's complement representation of the input value that is  
		 * with all bits inverted, which means it makes every 0 to 1 and every 1 to 0
		 */
		
		System.out.println(~a); // -11 
		
		//'NOT' operator(!): It is used to reverse the value of the operand
		System.out.println(!b); //true
		System.out.println("\n");
		
		
		
	}
	
	void ArthmethicOperators()
	{
		System.out.println("Inside ArthmethicOperators");
		int a=10;
		int b=5;
		System.out.println(a+b);//15 //addition
		System.out.println(a-b);//5  //subtraction
		System.out.println(a*b);//50 //multiplication
		System.out.println(a/b);//2  //division
		System.out.println(a%b);//0  //modulus
		
		//complex expression
		System.out.println(10*10/5+31*4/2); //82
		//evaluated on basis of precedence and associativity
		
		System.out.println("\n");
	}
	
	void ShiftOperators()
	{
		System.out.println("Inside ShiftOperators");
		
		/*
		 * 01010101<<1
		 * 10101010
		 * 
		 * right shift by 1 is like dividing by 2
		 * 1000 //8
		 * 1000>>1=100 //4
		 * 100 >> 1=10 //2
		 * 10>>1 = 1 //1
		 * 
		 * left shift by 1 is like multiplying by 2
		 * 1 << 1 = 10 //2
		 * 10<< 1 =100 //4
		 * 100 << 1 = 1000 //8
		 */
		
		System.out.println(10 << 2); //10*2^2 =40
		System.out.println(10 << 3); //10*2^3 = 80
		System.out.println(20 << 2 ); //20*2^2 = 80
		System.out.println(15 << 4);  //15 *2^4 =240
		
		System.out.println(10 >> 2); //10/2^2 =2
		System.out.println(20 >>2);  //20/2^2 =5
		System.out.println(20 >>3);	 //20/2^3 =2
		
		System.out.println("\n");
	}
	
	void RelationalOperators()
	{
		System.out.println("Inside RelationalOperators");
		
		int a =10;
		int b =20;
		
		//always gives output as true or false
		
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		
		System.out.println("\n");
	
	}
	
	void LogicalOperators()
	{
		System.out.println("Inside LogicalOperators");
		
		//Logical operators
		
		/*
		 * Logical operators check the conditions given as operand 
		 * Logical operators are used to check whether an expression is true or false. 
		 * They are used in decision making.
		 * 
		 * Logical And operator (&&) gives true if both conditions are true otherwise false.
		 * Second Condition is only checked if first one is true
		 * 
		 * Logical Or operator (||) gives true if either one of the conditions is true otherwise false
		 * Second Condition is only checked if first one is false
		 */
		
		int a=10,b=5,c=20;
		
		System.out.println(a<b && a++<c);  //false && true = false
		// second condition is not checked in this case
		
		System.out.println(a>b && a++<c);  //true && true = true
		// second condition is checked in this case
		
		System.out.println(a<b || a++<c); //false || true = true
		//second condition is checked
		
		System.out.println(a>b || a++<c);  //true && true = true
		// second condition is not checked in this case
		
		System.out.println("\n");
		
	}
	
	void BitwiseOperators()
	{
		System.out.println("Inside BitwiseOperators");
		
		/*
		 * Bitwise operators perform binary operations on binary of given inputs
		 * Both operands are always used in bitwise and (&) , or(|) and xor(^)
		 * & operator gives 1 if both operands are 1, 0 otherwise
		 * | operator gives 0 if both operands are 0, 1 otherwise
		 * ^ operator gives 1 if both operanda are different, 0 otherwise
		 * 
		 */
		
		int a=2,b=3;
		
		System.out.println(a&b);//10 & 11 = 10 //2
		System.out.println(a|b);//10 | 11 = 11 //3
		System.out.println(a^b); //10 ^11 =01 //1
		
		System.out.println("\n");
	}
	
	void TernaryOperator()
	{
		System.out.println("Inside TernaryOperator");
		
		//checks condition and gives output accordingly
		//there are two choices for output based on true or false of condition
		
		int a=2,b=5;
		
		int min=(a<b)?a:b;
		System.out.println(min);
		
		System.out.println("\n");
		
		
	}
	
	void AssignmentOperators()
	{
		System.out.println("Inside AssignmentOperators");
		
		int a=10;
		
		System.out.println(a);
		
		a+=5; //a=a+5 //15
		System.out.println(a);
		
		a-=5; //a=a-5 //10
		System.out.println(a);
		
		a*=5; //a=a*5 //50
		System.out.println(a);
		
		a/=5; //a=a/5 //10
		System.out.println(a);
		
		a%=5 ;//a=a%5 //0
		System.out.println(a);
		
		a>>>=2; //0
		System.out.println(a);
	}
}
