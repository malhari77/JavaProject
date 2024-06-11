package array;

//1.Declare an array
//2.add values into array
//3.find size of an array
//4.read single value from array
//5.read multi value from array

public class twodiamensional {

	public static void main(String[] args) 
	{
		//1.Declare two/multi diamensional array
//---------------------------------------------------------
		// 1 approach
		
		/*
		int a[][]= new int[3][2];
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		*/
//--------------------------------------------------------
		// 2 approach
		
		int a[][]= { {100,200},
					 {300,400},
					 {500,600} 
				   };
		
//-------------------------------------------------------	
		
		//2.add values into array	
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		
//-------------------------------------------------------	
		
		//3.find size of an array
		
		System.out.println("length of an row" +a.length);
		
		System.out.println("Length of column" +a[0].length);
		
//-------------------------------------------------------			
		//4.read single value from array
		
	//	System.out.println(a[2][1]);
		
//-------------------------------------------------------	
		//5.read multi value from array
		
		// normal for loop
		/*
		for(int r=0; r<a.length; r++)
		{
			for(int c=0; c<a[r].length;c++)
			{
				System.out.println(a[r][c]+ "   ");
			}
			
			System.out.println();
		}
		*/
//-------------------------------------------------------	
		
		// for.... each loop
		
		for(int arr[]:a)
		{
			for(int x:arr)
			{
				System.out.print(x+ "   ");
			}
			System.out.println("   ");
		}
	}
}
