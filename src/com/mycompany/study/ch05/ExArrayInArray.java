package com.mycompany.study.ch05;

public class ExArrayInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//kor, eng, math 과목별 총합과 평균
		// 사람별 총합과 평균

		String[] name = {"김다래","윤미진","김도연","채다솜","천주아" };
		int [][]score = {{99,88,45},{56,45,86},{56,89,76},{20,35,12},{76,23,45}};
		
		
		int[]sum = new int[5];
		double[]avg = new double[5];
		
	
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				//System.out.println("score[" + i +"][" + j +"]: " + score[i][j]);
			}
			
			System.out.println("-------------------");
		}
		
		
		
		
		
		
		
		
	}

}
