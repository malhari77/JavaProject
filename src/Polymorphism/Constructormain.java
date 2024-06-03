package Polymorphism;

public class Constructormain {

	public static void main(String[] args) 
	{
		Constructor con = new Constructor();
		
		Constructor con1 = new Constructor(10.2, 25.25, 14.89);
		
		System.out.println(con1.volume());

	}

}
