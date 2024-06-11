package Methodoverriding;

class Bank
{
	double roi() 
	{
		return 0;
	}
}

class icici extends Bank
{
	double roi() 
	{
		return 7.5;
	}
}

class SBI extends Bank
{
	double roi() 
	{
		return 9.11;
	}
}

public class overridingdemo {

	public static void main(String[] args) {
		
		icici ic =new icici();
		System.out.println(ic.roi());
		
		SBI sb = new SBI();
		System.out.println(sb.roi());
		

	}

}
