package com.mycompany.study.ch04;

public class ExIf5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ch04.05
		
		//int 타입의 변수를 3개 선언하고
		//세 정수중에서 최댓값, 최소값을 구하는 프로그램을 작성하시오.

		int a= 2;
		int b= 1;
		int c = 3;
		
		if(a<b && a<c) {
			if(b<c || c>b) {
				System.out.println("a 는 최솟값 입니다.");
			}
			
		}else if(a>b && a>c) {
			if(b<c || c>b)
			System.out.println("a는 최댓값 입니다.");
		}
		else if(b<a && b<c) {
			if(a<c || c>a) {
				System.out.println("b 는 최솟값 입니다.");
			}
			
		}else if(b>a && b>c) {
			if(a<c || c>a)
			System.out.println("b는 최댓값 입니다.");
		}
		if(c<b && c<a) {
			if(b<a || a>b) {
				System.out.println("c 는 최솟값 입니다.");
			}
			
		}else if(c>b && c>a) {
			if(b<a || a>b)
			System.out.println("c는 최댓값 입니다.");
		}else {
			System.out.println("적어도 2개의 동일한 정수가 존재 합니다. 수정해 주세요");
		}
		
		
		/*
		 * int a = 2; int b = 2; int c = 1;
		 * 
		 * if(a != b && b != c && c != a) { if(a > b && a > c) {
		 * System.out.println("최대값은 : " + a); } else if (b > a && b > c) {
		 * System.out.println("최대값은 : " + b); } else { System.out.println("최대값은 : " +
		 * c); }
		 * 
		 * 
		 * 
		 * if(a < b && a < c) { System.out.println("최소값은 : " + a); } else if ( b < a &&
		 * b < c ) { System.out.println("최소값은 : " + b); } else {
		 * System.out.println("최소값은 : " + c); } } else {
		 * System.out.println("적어도 2개의 동일한 정수가 존재 합니다. 수정해 주세요"); }
		 */
	}

}
