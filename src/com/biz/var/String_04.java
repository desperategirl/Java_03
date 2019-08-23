package com.biz.var;

public class String_04 {

	public static void main(String[] args) {
		
		
		// 숫자를 문자열 변수에 저장하려면 
		// 숫자를 문자열형으로 변환을 시켜야 한다.
		// 숫자를 문자열형으로 변환시키려면
		//              숫자 + "" 형식으로 만들어주면 
		//              문자열로 변환이 된다.
		
		String num = 0 + ""; // num = "0"
		
		
		// 어떤 변수에 어떤 값을 저장하거나, 어떤 변수에 
		// 다른 변수에 들어있는 값을 저장하려고 할 때
		// 발생하는 문제
		
		int intNum1 = 30;
		
		// 숫자형 변수에 담긴 값을
		// 문자열형 변수에 저장하려면
		// 숫자형 변수, "" 형식으로 작성한다.
		
		
		num = intNum1 + "";
		
		num = 3 + " " + 4;
		System.out.println(num);
		
		num = 3 + "" + 4;
	    System.out.println(num);
		
		
		
		
		
				

	}

}
