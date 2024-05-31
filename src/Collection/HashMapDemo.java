package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo 
{
	public static void main(String[] args) {
		
		
		//Declaration of HashMap
		
		//HashMap hm = new HashMap();
		//Map mymap = new HashMap();
		HashMap <Integer, String> hm = new HashMap <Integer, String> ();
		
		// how to add pairs
		
		hm.put(101, "Malhari");
		hm.put(102, "Patil");
		hm.put(103, "Engineer");
		hm.put(101, "Malhari Patil");
		hm.put(104, "Test");
		
		System.out.println(hm);   // {101=Malhari Patil, 102=Patil, 103=Engineer}
		
		
		//size of hashmap
		
		hm.size();
		System.out.println(hm.size());   // [101, 102, 103]
	
		// remove pair
		
		hm.remove(104);
		System.out.println(hm);
		
		//access value of the key
		
		hm.get(102);
		System.out.println(hm.get(102));
		
		// get all keys from hashmap
		
		System.out.println(hm.keySet());   // [101, 102, 103]
		System.out.println(hm.values());   // [Malhari Patil, Patil, Engineer]
		System.out.println(hm.entrySet()); // [101=Malhari Patil, 102=Patil, 103=Engineer]
		
		
		// reading data from hashmap
		// using  for.... each loop
		/*
		for(int p:hm.keySet())
		{
			System.out.println(p+"     "+hm.get(p));
		}*/
		
		//using Iterator
		
		Iterator <Entry<Integer,String>> it =hm.entrySet().iterator();
		
		while(it.hasNext())
		{
			Entry<Integer,String> entry = it.next();
			System.out.println(entry.getKey()+"    "+entry.getValue());
		}
		
		//clear
		hm.clear();
		System.out.println(hm.isEmpty());
	}
}
