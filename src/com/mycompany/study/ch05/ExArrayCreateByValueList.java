package com.mycompany.study.ch05;

public class ExArrayCreateByValueList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열안에 배열이 들어 갈 수 있음
//		int[] scoreEnglish;
//		int scoreMath [];
//		
//		String[]name;
//		String name1[];
//		
//		double[] total;
//		double abvg[];
//		
//		char[]grade232301;
//		char grade232302[];
//		
//		boolean[] score;
//		boolean score2[];
		
		
		
		int[] scoreChemistry = {100,99,98,97,96,89,56};
		
		//scoreChemistry[7] =93; // -> error 이미 한 번 초기화된 값에 값을 추가할 수 없음!! 왜냐면 선언과동시에 초기화 되기때문에
		  
		scoreChemistry[0] = 0; // -> 값을 바꿀 수는 있음 
		
		
		
		
		String[] scoreStudent = {"윤아","태연","수지","지영","유리"};
		
		char[] scoreGrade = {'A','B','C','D','E'};
		
		
//		int[] scorePhysics;
//		scorePhysics = {100,99,98,97,96};  //error
		//선언과 동시에 초기화
		
		int a = scoreChemistry.length;
		// System.out.println(a);
		
//		System.out.println(scoreChemistry[0]);
//		System.out.println(scoreChemistry[7]);
//		
//		for(int i=0; i<a; i++) {
//			System.out.println(scoreChemistry[6]);
//			
//		}
		
		
		// a -> scoreChemistry.length
		
		int sum = 0;
		for(int i=0; i<scoreChemistry.length; i++) {
			
			System.out.println(scoreChemistry[i]);
			sum = sum + scoreChemistry[i];
		
		}
		
		System.out.println("sum: " + sum);
		System.out.println("-----------");
//		
//		int sum2 = 0;
//		int i=0;
//		while(i<scoreChemistry.length) {
//				System.out.println(scoreChemistry[i]);
//				sum2 = sum2+scoreChemistry[i];
//				i++;
//		}
//		
//		System.out.println("sum2: " + sum2);
//		System.out.println("-----------");
//		
//		//향상된 for문 더 많이 쓰이는 추세
//		
//		int sum3 = 0;
//		for(int bb: scoreChemistry) {
//			System.out.println(bb);
//			sum3 = sum3 + bb;
//		}
//		System.out.println("sum3: " + sum3);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
