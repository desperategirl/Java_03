package com.biz.var;

public class IntVar_02 {

	
	/* 
	 * main() 메서드는 최종적으로
	 * JVM(자바가상머신)이 IntVar.02.main() 형태로 호출하여 사용하며
	 * 
	 * 만약 우리가 만든 클래스에 main() 메서드가 없으면
	 * 어떤 일도 시작하지 않는다.
	 * 
	 * main() 메서드를 '코드의 시작점'이라고 한다.
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		
		// 한 개의 EQ() 기호가 명령문에 있으면
		// 항상 오른쪽을 먼저 바라본다
	
		int intNum1 = 0;
		int intNum2 = 0;
		int intSum = 0;
		
		
		// 1. 40을 CPU로 보내고
		// 2. 어떤 연산을 수행할 것인가 보고 없으니
		// 3. 40이라는 값을 intNum1 변수에 저장한다.
		
		intNum1 = 40;
		
		
		
		// 1. intNum1에 저장된 값을 CPU로 보내고
		// 2. intNum2에 저장된 값을 CPU로 보내고
		// 3. 두 값을 덧셈연산하고 
		// 4. 결과를 intSum에 저장한다.
		
		intSum = intNum1 + intNum2;
		
		System.out.println(intSum); // 40
		
		intNum2 = 50;
		intSum = intNum1 + intNum2; // 90
		
		intSum = 100 + 200; // 300
		intSum = 10 * 20; // 200
		intSum = 200 / 10; // 20
		System.out.println(intSum); 
		
		
		
		// = 오른쪽을 해석하고 실행함
		// cpu가 num1과 num2의 값을 가져와서 연산하고 sum이라는 곳에 표시한다
		
		// num= 40 , 40을 cpu가 먼저 저장하고 그다음 num에 갖다 넣음

	}

}
