package com.piyush;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> mp = new HashMap<>();
		mp.put("myname","piyush");
		mp.put("mygender","male");
		
		Set<String>keys = mp.keySet();
		for(String key:keys) {
			System.out.println(key+" "+mp.get(key));
		}
		

	}

}
 