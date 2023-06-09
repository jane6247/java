package com.mycompany.study.ch06.Third;

public class ExArlthmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Arlthmetic arlthmetic = new Arlthmetic();
		
		
		int result = arlthmetic.add(1, 1);
		System.out.println("result: " + result);
		
		
		int result2 = arlthmetic.minus(5, 8);
		System.out.println("result2: " + result2);
		
		int result3 = arlthmetic.multi(5, 8);
		System.out.println("result3: " + result3);
		
		
		String result4 = arlthmetic.changeName("장원영");
		System.out.println("result4: " + result4);
		
		
		arlthmetic.girlGroup("블랙 핑크");
		//이미 선언문에 system.out.println을 써서 쓸 필요가 없음
		
		int result5 = arlthmetic.money();
		System.out.println("result5: " + result5);
		
	}


	 
} 
