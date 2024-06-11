package Keywords;

// final keyword for variable
class test
{
	final int a=145;
}

public class Finalkeyword {

	public static void main(String[] args) {
		
		test t = new test();
		
		//t.a=457;     // access only final keyword variable data.
		System.out.println(t.a);

	}

}
