package unit_01;


/* Problem Statement:

P8_String: 

(Create separate logic in separate function)

F1 - Check the entered string is palindrome or not? 
  		String s = "75457"
  		Output: Yes it is a palindrome or No it is not a palindrome.

F2 - Make a reverse of a string using?
F3 - String Compare: Check if the strings are equal or not?

 * */

public class P8_String {

	public static void main(String[] args) {

		QuestionsOnString obj = new QuestionsOnString();

		String s1 = new String("75457");
		String s2 = new String("7545a");

		obj.palindromeOrNot(s1);
		obj.reverseOfAString(s2);
		obj.stringEqualOrNot(s1, s2);

	}

}

class QuestionsOnString {

	void palindromeOrNot(String s) {
		int i=0;
		int j= s.length()-1;
		
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				System.out.println("No it is not a palindrome");
				return;
			}
			i++;j--;
		}
		
		System.out.println("Yes it is a palindrome");

	}

	void reverseOfAString(String s) {
		char [] c= s.toCharArray();
		int i=0;
		int j=s.length()-1;
		while(i<j)
		{
			char temp=c[i];
			c[i]=c[j];
			c[j]=temp;
			i++;
			j--;
		}
		
		String reverse= new String(c);
		System.out.println("Reverse of "+s+" is "+reverse);

	}
	
	void stringEqualOrNot(String s1,String s2) {
		boolean b=s1.equals(s2);
		if(b)
		{
			System.out.println(s1+" and "+ s2+" are equal");
		}
		else
		{
			System.out.println(s1+" and "+ s2+" are not equal");
			
		}
		
	}
}