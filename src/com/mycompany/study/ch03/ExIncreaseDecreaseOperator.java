package com.mycompany.study.ch03;

public class ExIncreaseDecreaseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ch03.02
		
		//증감 연산자(++,--)
		
		int i = 0;
		int j = 0;
		
		++i;
		j++;
		
		System.out.println("i: " +i);
		System.out.println("j: " +j);
		System.out.println("-------------------");
		
		
		
		int a =1;
		int b = 1;
		
		--a;
		b--;
		
		System.out.println("a: " +a);
		System.out.println("b: " +b);
		
		int k = i++; // i를 k에 대입, i를 1증감
		int m = ++j; // j를 1증가,j를 m에 대입
		
		System.out.println("k: " +k);
		System.out.println("i: " +i);
		System.out.println("m: " +m);
		System.out.println("j: " +j);
		System.out.println("---------------");
		
		--i;
		int z = ++i + j++; //  j++ 에서 ++ 는 사칙연산 먼저 실행하고 증감시켜라  2+2 계산 먼저 이루어지고 j혼자 증감하여 최종 z= 4 i = 2 j=3이 된다. 별로 중요화지는 않음!
		System.out.println("z: " +z);
		System.out.println("i: " +i);
		System.out.println("j: " +j);
		
	}

}
