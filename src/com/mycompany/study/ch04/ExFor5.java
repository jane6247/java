package com.mycompany.study.ch04;

public class ExFor5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1 (10*5)
//**********
//**********
//**********
//**********
//**********
//출력하는 프로그램을 만드시오
		for(int i=1; i<=5;i++) {
			for(int j=1; j<=10;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------------");

		
		
//2 (1,5번째 출력)
//**********
//*        *
//*        *
//*        *
//**********
// 출력하는 프로그램을 만드시오 
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=10; j++) {
				if(i>=2 && i<=4) {
					if(j>=2 && j<=9) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println("-------------------");
		}
	}


