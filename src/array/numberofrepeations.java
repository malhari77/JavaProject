package array;

public class numberofrepeations {

	public static void main(String[] args) 
	{
		int a[]= {10,200,45,21,200,10,10};
		
		int num=200;
		int count=0;
		
		for(int s:a)
		{
			if(s==num)
			{
				count++;
			}
		}

		System.out.println(count);
	}

}
