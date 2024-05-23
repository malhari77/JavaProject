package oopsconcepts;

public class Logicaloprator 
{
	public static void main(String[] args) 
	{
		int a=200, b=150, c=400, d=175;
		
		System.out.println((a>b)&&(c>d));
		System.out.println((a>b)&&(c<d));
		System.out.println((a<b)&&(c>d));
		System.out.println((a<b)&&(c<d));
		
		int e=45, f=40, g=123, h=98;
		
		System.out.println((e>f)||(g>h));
		System.out.println((e<f)||(g<h));
		System.out.println(e!=f);
		
		int i=55;
		int j=45;
		
		System.out.println(i!=j);
	}
}
