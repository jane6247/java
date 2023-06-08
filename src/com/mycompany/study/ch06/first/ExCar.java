package com.mycompany.study.ch06.first;

public class ExCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a =1;
		System.out.println(a);
			
		Car car = new Car();     //생성 (기본생성자)
	//  클래스 변수명 new 연산자 생성자        클래스와 생성자는 이름이 똑같아야함
		
		//이하 사용
		System.out.println("car.name: " + car.name);
		System.out.println("car.color: " + car.color);
		System.out.println("car.company: " + car.company);
		System.out.println("car.engine: " + car.engine);
		
		car.go();
		car.back();
		
		
		Ipod ipod = new Ipod();   //함수호출
		System.out.println("ipod.color: " + ipod.color);
		System.out.println("ipod.size1: " + ipod.size1);
		System.out.println("ipod.price: " + ipod.price);
		System.out.println("ipod.isTakePhoto: " + ipod.isTakePhoto); //변수호출
		
		 ipod.PriceExpensive();
		 ipod.PriceReasonable();
		
	}

}
