package com.mycompany.study.ch06.Third;

public class Arlthmetic {

	
	
	//더하기 함수 (피연산자는 2개로 한정) 선언
	//y= a + b
	
	public int add(int a,int b) {
		int y = a +b;
		return y;
	}

    public int minus(int a, int b) {
    	int y = a - b;
    	return y;
    }

    public int multi(int a, int b) {
    	int y = a * b;
    	return y;
    }
    

    // x : 장원영 y : tony
    public String changeName(String name) {
    	String result;
    	if(name.equals("장원영")) {
    		result = "Tony";
    	}else {
    		result = "I do not know";
    	}
		return result;	
    }
    // x : 아이브 y: return은 없고 "장원영은 너무 예뻐"라고 출력만
    //return 없이 써보기 void return 필요없음 void는 함수를 돌았을 때 나오는 return 이 없음 (string group)-> 매개변수
    public void girlGroup(String group) {
    switch(group) {
    case "아이브":
    	System.out.println("장원영은 너무 예뻐");
    	break;
    	default:
    		System.out.println("다른 사람은 그냥 예뻐");
    		break;
     }
    }
    // x: 값이 없음  y:10,000 함수를 실행하면 "10,000원을 주웠습니다"라고 출력

    public int money() {
    	
    	
    	return 10000;  //return 1; -> 써주고 시작
    }
    
    
}
