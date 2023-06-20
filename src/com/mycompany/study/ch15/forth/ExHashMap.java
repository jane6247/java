package com.mycompany.study.ch15.forth;

import java.util.HashMap;
import java.util.Map;

public class ExHashMap {

	public static void main(String[]srgs) {
	
	Map<String, Integer> map = new HashMap<>();  //standard
	
	Map<String, String> map2 = new HashMap<>();
	
	HashMap<String, Integer> hashMap = new HashMap<>();  // not bad
	
	
	map.put("김다래", 100);
	map.put("윤아", 99);
	map.put("수영", 98);
	map.put("써니", 97);
	
	// System.out.println("map.get(\"김다래\"): "+ map.get("김다래"));
	
	map.remove("윤아");
	map.clear(); //  map에 있는 모든 게 사라짐.

	for(String strKey : map.keySet()) {
		Integer strValue = map.get(strKey);
		System.out.println(strKey + ":" + strValue);
	}
	
	map2.put("김다래", "100");
	
	
	}
	
}
