package oopsconcepts;

public class Arithmeticoprators 
{
	public static void main(String[] args) 
	{
		//Arithmetic Operators
		int a;
		int b;
		int c;
		
		a=10;
		b=20;
		c= a+b;
		System.out.println("Total of a & b is:" + c);
		
		//Subtraction
		int d;
		int e;
		int f;
		d=1234;
		e=234;
		f=d-e;
		System.out.println("substraction of d & e is:"+ f);
		
		//Multiplication
		int g=254;
		int h=234;
		int i=g*h;
		System.out.println("Multiplication of g & h is:" +i);
				
		//Division
		int j=9876;
		int k=4563;
		int l=j/k;
		System.out.println("Division of j * k is:" + l);
		
		//Modulus
		int m=5463;
		int n=3452;
		int o=m%n;
		System.out.println("Modulus of m & n is:" + o);
		
		//Increment
		int p=76;
		++p;
		System.out.println(p);
		
		//Decrement
		int q=43;
		--q;
		System.out.println(q);
	}
}
