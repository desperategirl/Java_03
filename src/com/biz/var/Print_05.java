package com.biz.var;

public class Print_05 {

	public static void main(String[] args) {
		
		int num = 3;
		System.out.printf("%d x %d = %d\n" , num, 2, num*2);
		
		// 자바에서는 printf를 잘 안쓰고 C언어에서 자주 쓰는 method인데 방법은 까다롭지만
		// 출력값이 상당히 깔끔하다
		
		// ln = enter. 줄 바꿈
		// f = formeting. form 양식, 모양.
		
		System.out.printf("%d x %d = %d\n" , num, 2, num*2);
		
		
		/*
		 *  printf() 메서드는
		 *  형식에 맞는 모양의 출력결과를 얻기 위한 명령문이다
		 *  1. 출력하고자 하는 형식의 문자열을 만든 후
		 *  2. 변수, 값, 계산식이 위치할 곳에 %d 특수문자열을 포함시키면 
		 *     해당 특수문자열 대신에 변수, 값, 계산식과 바꾸어 문자열을 형성하고 출력해 준다.
		 *  3. 자동 줄바꿈이 되지 않으므로 문자열 끝에는 줄바꿈인 \n을 넣어준다.
		 */
		System.out.printf("%d x %d = %2d\n" , num, 2, num*2);
		System.out.printf("%d x %d = %2d\n" , num, 3, num*3);
		System.out.printf("%d x %d = %2d\n" , num, 4, num*4);
		System.out.printf("%d x %d = %2d\n" , num, 5, num*5);
		System.out.printf("%d x %d = %2d\n" , num, 6, num*6);
		System.out.printf("%d x %d = %2d\n" , num, 7, num*7);
		System.out.printf("%d x %d = %2d\n" , num, 8, num*8);
		System.out.printf("%d x %d = %2d\n" , num, 9, num*9);
		
		
		

	}

}
