package Keywords;

// final key word used for below statement
//final class test1

 class test1
{
	// final void m()
	 void m()
	{
		System.out.println("this is m method from class test1");
	}
}

class test2 extends test1           // incorrect.
{
	void m()                        // overriding   , incorrect. bcoz m is final
	{
		System.out.println("this is m method from class test2 ");
	}
}

public class Finalformethod {

	public static void main(String[] args) {
		

	}

}
