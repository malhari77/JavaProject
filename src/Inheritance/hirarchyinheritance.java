package Inheritance;

	class hirarchy
	{
		int h = 789;
		double d = 478.58;
	
		void test() 
	{
		System.out.println(h);
		System.out.println(d);
	}
	}
	class hirarchy1 extends hirarchy
	{
		char c = 'P';
		String s = "Malhari Patil";
		
		void test1() 
		{
			System.out.println(c);
			System.err.println(s);
		}
	}
	
	class hirarchy2 extends hirarchy
	{
		double r = 8974;
		int p = 54;
		
		void test2() 
		{
			System.out.println(r);
			System.out.println(p);
		}
	}
	
public class hirarchyinheritance {

	public static void main(String[] args) 
	{
		
		hirarchy2 h2 = new hirarchy2();
		System.out.println(h2.p);
		System.out.println(h2.r);
		System.out.println(h2.h);
		System.out.println(h2.d);
		
		h2.test();
		h2.test2();
	}

}
