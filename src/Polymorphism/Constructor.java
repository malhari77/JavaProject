package Polymorphism;

public class Constructor 
{
	double width, height, depth;
	
	Constructor()       //1
	{
		/*
		width=0;
		height=0;
		depth=0;
		*/
		
		width=height=depth=0;
	}
	Constructor(double w, double h, double d)       //2
	{
		width=w;
		height=h;
		depth=d;
	}
	
	Constructor(double len)                          //3
	{
		width=height=depth=len;
	}
	double volume()
	{
		return(width*height*depth);
	}
	
}
