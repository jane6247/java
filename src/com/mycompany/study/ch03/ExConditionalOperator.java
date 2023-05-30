package com.mycompany.study.ch03;

public class ExConditionalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// ch03.09
		
		//삼항 연산자 (조건식)? A:B  코드의 간결성때문
		
		int math = 85;
		
		char grade = (math >90)? 'A':'B';  //char은 " 안됨 글자도 한 글자만 들어감.
		System.out.println("grade: " + grade);
		
		
		if(math> 90) {
			grade = 'A';
		}else {
			grade = 'B';
		}
		System.out.println("grade: " + grade);
			
		
	}

}
  