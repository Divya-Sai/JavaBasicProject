package myPackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> hash = new HashMap<String,String>();
		hash.put("Name", "Sai Roshita Srinivasa");
		hash.put("DOB", "14-Feb-202");
		hash.put("Place of Birth", "London");
		
		System.out.println(hash.get("Name"));
		
		//Method1
		Iterator<String> itr = hash.keySet().iterator();
		while(itr.hasNext()) {
			String Key =itr.next();
			System.out.println(Key+" : "+hash.get(Key));
		}

		System.out.println("Method 2");
		for(Entry<String, String> entry :hash.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

}
