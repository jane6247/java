package com.mycompany.study.ch07.first;

public class ExMobilePhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CellPhone cellPhone = new CellPhone();
		
		cellPhone.powerOn();
		
		
		System.out.println("=====================");
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone();
		
		dmbCellPhone.powerOn();
		
		dmbCellPhone.turnOffDmb();
		
		System.out.println("=====================");
		
		MobilePhone mobilePhone = new MobilePhone();
		
		mobilePhone.aaa();
	
		
		
	}

}
