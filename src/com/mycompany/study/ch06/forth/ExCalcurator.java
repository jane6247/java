package com.mycompany.study.ch06.forth;

public class ExCalcurator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calcurator calcurator = new Calcurator();
		
		//오버로드 파라미드(areaSquare)부분이 같을때를 말함
		double result=calcurator.areaSquare(5);
		double result2=calcurator.areaSquare(5, 6);
		
		
		System.out.println("result: " + result);
		System.out.println("result2: " + result2);
	}

}
