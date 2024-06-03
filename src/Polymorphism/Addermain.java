package Polymorphism;

public class Addermain {

	public static void main(String[] args)
	{
		Adder addobj = new Adder();
		addobj.sum();                //1
		addobj.sum(100, 200);        //2
		addobj.sum(478, 50);         //4
		addobj.sum(10, 25.25);       //3
		addobj.sum(25, 45, 47);      //5
		
	}

}
