package array;

//1.Declare an array
//2.add values into array
//3.find size of an array
//4.read single value from array
//5.read multi value from array

public class singlediamensionalarray {

	public static void main(String[] args) 
	{
	
		// declare an array
		// 1 aproach
		
		//int a[] = new int[5];
		
		//2.add values into array
		/*
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		*/
	
		// 2 approach
		
		int a[]= {100,200,300,400,500};
		
		String s[]= {"test", "patil", "send", "asf"};
		
		char c[]= {'a', 'm', 'a', 'h', 'd','o'};
		
		//3.find size / length of an array
		
		System.out.println("length of an array:"+a.length);
		System.out.println("length of an array:"+s.length);
		System.out.println("length of an array:"+c.length);
		
		
		//4.read single value from array
		
		System.out.println(a[4]);   // 4 is index
		
		
		//5.read all / multi value from array
	//---------------------------------------------------------
		// normal for loop
		/*for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		*/
		//enhanced for loop    for....each loop
	//-------------------------------------------------------
		for(char x:c)
		{
			System.out.println(x+"   ");
		}
	//--------------------------------------------------
		System.out.println("   ");
	}

}
