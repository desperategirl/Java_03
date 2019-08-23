package com.biz.var;

public class Float_Int_02 {

	public static void main(String[] args) {
		
		
		int intKor = 90;
		int intEng = 80;
		int intMath = 78;
		
		int intSum = intKor + intEng + intMath;
		float fAvg = intSum / 3.0f;
		
		//코딩하는 과정에서 3f;에서 3.0f;를 빼먹었더니 소수점 이하 자리값이 나오지 않음
		
		System.out.println("총점 : " + intSum);
		System.out.println("평균 : " + fAvg);
		
		

	}

}
