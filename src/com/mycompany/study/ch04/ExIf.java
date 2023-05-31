package com.mycompany.study.ch04;

public class ExIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ch04.01
		
		//if - 학점계산
		
		int score = 81;
		
		if(score >= 90) {
		  System.out.println(" 당신의 학점은 A입니다");
		}else if( score>= 80) {
			System.out.println(" 당신의 학점은 B입니다");			
		}else if (score >=70) {
			System.out.println(" 당신의 학점은 c입니다");	
		}else if (score >=60) {
			System.out.println(" 당신의 학점은 D입니다");	
		}else{
			System.out.println(" 당신의 학점은 F입니다");	
		}
		
		
		int score1= 49;
		if(score>=90) {
			if(score>=97) {
			 System.out.println(" 당신의 학점은 A+입니다");
			}else if (score>=93) {
			 System.out.println(" 당신의 학점은 A입니다");	
			}else
				System.out.println(" 당신의 학점은 A-입니다"); 
		}else if(score>=80) {
			
			if(score>=87) {
				System.out.println(" 당신의 학점은 b+입니다");	
			}else if (score>=83) {
				 System.out.println(" 당신의 학점은 b입니다");	
				}else
					System.out.println(" 당신의 학점은 b-입니다"); 
		}else if(score>=70) {
			
			if(score>=77) {
				System.out.println(" 당신의 학점은 c+입니다");	
			}else if (score>=73) {
				 System.out.println(" 당신의 학점은 c입니다");	
				}else
					System.out.println(" 당신의 학점은 c-입니다"); 
		
		}else if(score>=60) {
			
			if(score>=67) {
				System.out.println(" 당신의 학점은 d+입니다");	
			}else if (score>=63) {
				 System.out.println(" 당신의 학점은 d입니다");	
				}else
					System.out.println(" 당신의 학점은 d-입니다"); 
		
		}else if(score>=50) {
			
			if(score>=57) {
				System.out.println(" 당신의 학점은 e+입니다");	
			}else if (score>=53) {
				 System.out.println(" 당신의 학점은 e입니다");	
				}else
					System.out.println(" 당신의 학점은 e-입니다"); 
		
		}
		
		
		else if (score>=60) {
			if(score >=67) {
				System.out.println(" 당신의 학점은 d+입니다");
			}else if (score < 67 && score >63) {
				System.out.println(" 당신의 학점은 d입니다");
			}else {
				System.out.println(" 당신의 학점은 d-입니다");
			}
		}else {
			System.out.println(" 당신의 학점은 f입니다");
		}
		
	}

}
