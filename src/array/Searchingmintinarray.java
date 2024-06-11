package array;

public class Searchingmintinarray {

	public static void main(String[] args) 
	{
		int a[]= {10,50,41,25,78,25};
		
		int search_element = 2;
		
		boolean status = false;
		
		/*for(int i=0; i<a.length; i++)
		{
			if(a[i]==search_element)
			{
				System.out.println("Element found");
				status=true;
				break;
			}
		}*/
		
		for(int x:a)
		{
			if(x==search_element)
			{
				System.out.println("Element found");
				status=true;
				break;
			}
		}
		
		if(status == false)
		{
			System.out.println("Element not found");
		}
	}

}
