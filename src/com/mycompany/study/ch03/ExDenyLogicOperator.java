package com.mycompany.study.ch03;

public class ExDenyLogicOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// ch03.02
		
	   // 논리 부정 연산자(i)
		
		boolean play = true;
		
		play = !play;
		
		System.out.println("play: " + play);
		System.out.println("-------------");
		
		int i = 3;
		
		if(!(i==3)) {
			System.out.println("뭔가를해라" );
			
		}
	
	}

}
  