package com.mycompany.study.ch04;

public class ExIf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//ch04.03
		
		//int 타입의 변수를 1개 선언하고 
		//짝수인지 홀수인지 판단하여 결과를 출력하는 프로그램을 작성하시요
		
		int a = 0;
		
		//입력하신 3은 홀수 입니다.
		
		if(a !=0) {
		
		if(a % 2 ==0) {
			System.out.println("입력하신 값은 짝수입니다.");
		}else {
			System.out.println("입력하신 값은 홀수입니다.");
		}
	   }else {
		//a = 0
		System.out.println("0은 홀짝을 판달 할 수 없습니다.");
	}

	}
}
