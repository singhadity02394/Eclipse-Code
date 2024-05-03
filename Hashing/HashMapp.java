package Hashing;
import java.util.*;

public class HashMapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer>hashMap  = new HashMap<String, Integer>() ;
		//put
		hashMap.put("India",1);
		hashMap.put("Nepal",2);
		hashMap.put("China",3);
		hashMap.put("Pakistan",4);
		hashMap.put("Oman",5);
		
		System.out.println(hashMap);
		//get
		
		System.out.println(hashMap.get("India"));
		
		///containeKey
		System.out.println(hashMap.containsKey("USA"));
		
		//remove
		System.out.println(hashMap.remove("pakistan"));
		
		System.out.println(hashMap);
		
		//size
		System.out.println(hashMap.size());
		
	hashMap.clear();
	System.out.println(hashMap.isEmpty());
		

	}

}
