package array;

public class Searchstr {

	public static void main(String[] args) 
	{
		String s[]= {"Test","Engineer", "software","sdlc", "stlc"};
		
		String w="Engineer";
		
		boolean str = false;
		
		for(String d:s)
		{
			if(d==w)
			{
				System.out.println("String Found Succesfully");
				str= true;
				break;
			}
			
		}
		if(str==false)
		{
			System.out.println("String not Found");
		}

	}

}
