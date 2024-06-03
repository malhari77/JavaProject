package Inheritance;

class A
{
	int a=123;
	char c ='M';

	void inheritance()
	{
		System.out.println(a);
		System.out.println(c);
	}
}
class B extends A
{
	int b=453;
	String s = "Malhari";
	
	void singleinheritance()
	{
		System.out.println(b);
		System.out.println(s);
	}
}

public class singleinheritance {

	public static void main(String[] args) {
		
		
		A aobj = new A();
		
		B bobj = new B();
		
		System.out.println(bobj.a);
		System.out.println(bobj.b);
		
		bobj.inheritance();
		bobj.singleinheritance();

	}

}
