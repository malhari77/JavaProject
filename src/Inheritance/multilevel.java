package Inheritance;

	class parent
	{
		int x=231;
		char m ='M';
		String s = "Malhari";
		
		void dispaly()
		{
			System.out.println(x);
			System.out.println(m);
			System.out.println(s);
		}
		
	}
	class child1 extends parent
	{
		int c = 987;
		String p = "Patil";
		
		void show() 
		{
			System.out.println(c);
			System.out.println(p);
		}
	}
	class child2 extends child1 
	{
		double d = 14.0;
		int m1 =45;
		
		void print() 
		{
			System.out.println(d);
			
			System.out.println(m1);
		}
	}
	class child3 extends child2
	{
		double d1 = 47.25;
		
		void child3()
		{
			System.out.println(d1);
		}
	}
public class multilevel {

	public static void main(String[] args) {
		
		
		parent p = new parent();
		child1 c1 = new child1();
		child2 c2 = new child2();
		child3 c3 = new child3();
		System.out.println(c2.x);
		System.out.println(c2.m);
		System.out.println(c2.s);
		System.out.println(c2.c);
		System.out.println(c2.p);
		System.out.println(c2.d);
		System.out.println(c2.m1);
		System.out.println(c3.d1);
		
		c2.dispaly();
		c2.show();
		c2.print();
		c3.child3();
	}

}
