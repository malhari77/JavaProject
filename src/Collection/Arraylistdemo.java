package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylistdemo 
{
	public static void main(String[] args) {
		

	//Declaration
	ArrayList list = new ArrayList();
	//List list = new ArrayList();
	
	//ArrayList <String>list = new ArrayList<String>();    //homogenious data string type data
	//ArrayList <Employee>list1 = new ArrayList<Employee>();  // hold multiple employee objects
	
	//adding dat into arraylist
	// Hetrogenious data added
	list.add(100);
	list.add(10.50);
	list.add("Welcome Malhari");
	list.add('A');
	list.add(true);
	list.add(100);
	list.add(null);
	list.add(null);
	list.add(null);
	list.add("Welcome Malhari");
	
	//size of arraylist
	System.out.println("Size of an arraylist " +list.size());
	
	//printing arraylist
	
	System.out.println("Printing data from arraylist" + list);
	
	//remove element from arryalist
	list.remove(5);   // 5 is index
	System.out.println("After remove Printing data from arraylist" + list);
	
	//insert element in some where
	list.add(2,"java");
	System.out.println("After inserttion Printing dat from arraylist" + list);
	
	//modify element
	list.set(2, "Python");
	System.out.println("After modification " + list);
	
	list.remove(9);
	System.out.println("After removed " + list);
	
	list.remove(8);
	System.out.println("After removed " + list);
	
	// access specific element from arraylist
	list.get(3);
	System.out.println(list.get(3));
	
	// reading all element from arraylist
	// using normal for loop
		
	for(int i=0;i<list.size();i++)
	{
		System.out.println(list.get(i));
	}
	
	// using for...each loop
	
	for(Object x:list)
	{
		System.out.println(x);
	}
	
	//using itrator  only for collection
	Iterator it =list.iterator();
	
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		// checking arraylist empty or not.
		  list.isEmpty();
		  System.out.println("Is arraylist empty? " + list.isEmpty());
		  
		// remove all elements from arraylist
		  list.removeAll(list);
		  
		  ArrayList list1 = new ArrayList();
		  list1.add(100);
		  list1.add(10.5);
		  
		  list.removeAll(list1);
		  System.out.println("After removing multiple elements " + list);
		  
		  // remove all items from arraylist
		  list.clear();
		  System.out.println("Is array list empty? " + list.isEmpty());
		  
	}
}
