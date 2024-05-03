package Hashing;

import java.util.HashMap;
import java.util.Set;

public class IterateHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hh = new HashMap<>();
		hh.put("Sunny", 12);
		hh.put("Suraj", 13);
		hh.put("Shohan", 14);
		hh.put("Sonu", 15);
		
//		System.out.println(hh);
		//Iterate 
		Set<String>keys =  hh.keySet();
		System.out.println(keys);
		
		for(String k:keys) {
			System.out.println("key"+k +"value"+hh.get(k));
		}
		
		

	}

}
