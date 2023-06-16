package com.mycompany.study.ch15.first;

import java.util.ArrayList;
import java.util.List;

public class ExLanguage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Language> arrayList = new ArrayList<Language>();
		
		for(Language language: arrayList) {
			System.out.println("language.name:" + language.name);
			System.out.println("language.version:" + language.version);
		}  //--> 여기선 arrayList가 없는 상태로 바도 무관 그래서 안에 들어갈 수가 없어서 입력이 안됨
		
		//arrayList.add("JAVA");  // Language 객체를 넣어 주어야 되어서 오류
		//arrayList.add(11);  // Language 객체를 넣어 주어야 되어서 오류
		
		
		Language language = new Language("JAVA", 11);
	
		arrayList.add(language);
		arrayList.add(new Language("Python", 8));
		arrayList.add(new Language("C", 6));
		
		
		
		arrayList.add(language);
		
		for(Language a: arrayList) {
			System.out.println("language.name:" + language.name);
			System.out.println("language.version:" + language.version);
			System.out.println("============================");
		}
		// 굉장히 중요한 구문 앞으로 많이 보게 될 것
		
//		List<String> list = new ArrayList<String>();  //generic  //오류뜨는데 ctrl shift o  누르면 import 생김
//		
//		list.add("JAVA");
//		list.add("Python");
//		list.add("Node");
//		list.add(2,"C#");
//		
//		
////		for(int i=0; i<list.size(); i++) {  //-->옛날 for문 요즘은 이렇게 안씀// 숫자계산 같은거 할때만
////			System.out.println("list.get("+i+"): " + list.get(i));
////		}
////		System.out.println("============================");
//		
//		int i = 0;
//		for(String a: list) {
//		// String a = list[i];  --> 이렇게 들어있다고 생각하면 이해하기 쉬움	
//			System.out.println(i +":" +a);
//			i++;
//		}// 향샹된 for문 요즘 다 이렇게 씀
//		
//		System.out.println("============================");
//		
//		list.remove(2);
//		list.remove("Python");
//		
//		
//		int j = 0;
//		for(String a: list) {
//		
//			System.out.println(j +":" +a);
//			j++;
//		}
//		
	
	
	


//	ArrayList <String> arrayList = new ArrayList<String>();  -->훨씬 빠름 갯수가 많아지면 이걸 쓰는게 더 나음
//	arrayList.add("JAVA");
//	arrayList.add("Python");
//	arrayList.add("Node");
//	arrayList.add(2,"C#");
//	
//	
//	for(int i=0; i<arrayList.size(); i++) {  //-->옛날 for문 요즘은 이렇게 안씀// 숫자계산 같은거 할때만
//		System.out.println("arrayList.get("+i+"): " + arrayList.get(i));
//	}
//	System.out.println("============================");
//	
//	for(String a: arrayList) {
//	// String a = list[i];  --> 이렇게 들어있다고 생각하면 이해하기 쉬움	
//		System.out.println("a:" +a);
//	}// 향샹된 for문 요즘 다 이렇게 씀
		
	}
}


