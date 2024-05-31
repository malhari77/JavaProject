package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo 
{
	public static void main(String[] args) 
	{
		
		//Declaration of HashSet
		
		HashSet myset = new HashSet();
		//Set myset = new HashSet();
		
		//HashSet <String>myset = new HashSet<String>();    // homogenious data
		
		// adding element in hashset
		
		myset.add(100);
		myset.add(10.5);
		myset.add("Welcome Malhari");
		myset.add(true);
		myset.add(100);
		myset.add('A');
		myset.add(null);
		myset.add(null);
		// print hashset
		System.out.println(myset);  // [null, A, 100, 10.5, Welcome Malhari, true]
		
		// size of hashset
		System.out.println(myset.size());
		
		// remove specfic element from hashset
		myset.remove(10.5);   // 10.5 is value
		System.out.println(myset);
		
		//  inserting element in hashset    ---- not possible
		// access specfic element from hashset  --- not posbile
		
		// convert hashset to arryalist
		ArrayList al = new ArrayList(myset);
		System.out.println(al);     //        -------- [null, A, 100, Welcome Malhari, true
		System.out.println(al.get(2));
		
		// read all element using for....each loop
		/*for(Object x:myset)
		{
			System.out.println(x);
		}
		*/
		
		//using itrator  
		Iterator it =myset.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		// clearing all element in hashset
		myset.clear();
		System.out.println(myset.isEmpty());
		
	}

}
