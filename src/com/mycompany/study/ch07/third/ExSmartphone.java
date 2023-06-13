package com.mycompany.study.ch07.third;

public class ExSmartphone {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		// Phone phone = new Phone();   -> 생성할려면 오류남 생성하는 것이 아님

		SmartPhone smartPhone = new SmartPhone("smart");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		smartPhone.open();
	}

}
