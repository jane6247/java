package com.mycompany.study.ch03;

public class ExArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ch03.04
		
		//산술 연산자
		
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 +v2;
		int result2 = v1 -v2;
		int result3 = v1 *v2;
		int result4 = v1 /v2;
		int result5 = v1 %v2;
				
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
		System.out.println("result4: " + result4);
		System.out.println("result5: " + result5);
		
		double result6 = (double)v1/v2;  //평균을 나눌 때 정수는 뒤에가 짤림. 소수점까지 나타내려면  double로 선언  *외워두는게 좋음. 가끔 쓰일 때가 있음.
		System.out.println("result6: " + result6);
		
			
	}

}
