package com.mycompany.study.ch12;

import java.awt.Toolkit;

public class ExBeep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
Toolkit toolkit = Toolkit.getDefaultToolkit();   // 
		
		for(int i=0; i<5; i++) {		
			toolkit.beep();
			try {
				Thread.sleep(500);// 잠깐씩 소프트웨어를 멈추게 하는 것 
			}catch(InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
