package com.mycompany.study.ch15.sceond;

import java.util.HashSet;

public class ExHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Set<String> set = new HashSet<>();
		HashSet<String> languages = new HashSet<>();
		
//		languages.add("JAVA");
//		languages.add("JDBC");
//		languages.add("Servlet");
		languages.add("1");
		languages.add("2");
		languages.add("3");
		languages.add("4");
		languages.add("5");
		languages.add("6");
		languages.add("7");
		languages.add("8");
		languages.add("9");
		
		
		languages.remove("4");
		
		
		for(String language: languages) {
			 System.out.println("language:" + language);
		}
		
	}

}
