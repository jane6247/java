package com.mycompany.study.ch06.first;

public class ExIpod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =1;
		System.out.println(a);
			
		Ipod ipod = new Ipod();     //생성
	//  클래스 변수명
		
		//이하 사용
		System.out.println("ipod.size1: " + ipod.size1);
		System.out.println("ipod.color: " + ipod.color);
		
		
	    ipod.PriceExpensive();
		ipod.PriceReasonable();
		
	}

}
