package com.mycompany.study.ch04;

public class ExFoOneToTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			//1부터 10까지 더하는 프로그램 작성
			//
		
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			sum = sum + i;
			System.out.println("i: " + i + "| sum: " +sum);
			
		}
		// 11~50까지 짝수의 합을 구하시오
		
		int allsum = 0;
		
		for(int i= 11; i<=50; i++) {
			if(i %2 ==0) {
				allsum += i;
			System.out.println( i + "|" + allsum);
			}
			
		}
	}

}
