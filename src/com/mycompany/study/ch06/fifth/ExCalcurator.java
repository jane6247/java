package com.mycompany.study.ch06.fifth;

public class ExCalcurator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Calcurator calcurator = new Calcurator();  static 있으면 쓸 필요 없음
		
		
		
		
		double result = 10*Calcurator.pi;
		System.out.println("result: " + result);
		
		int result1=Calcurator.plus(1,2);
	    int result2=Calcurator.minus(1, 3);
				
		
		
		
		//오버로드 파라미드(areaSquare)부분이 같을때를 말함
		//int result1=calcurator.plus(1,2);
		//int result2=calcurator.minus(1, 3);
		
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
	}

}
