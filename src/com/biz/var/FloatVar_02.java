package com.biz.var;

public class FloatVar_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float fNum = 60.0f;
		
		// ���� 100�� �Ǽ��� �ٲ�� ������ ����
		fNum = 100;
		System.out.println(fNum);
		
		// ���� 3�� �Ǽ� 3.0���� �ٲ� �� 30.0 / 3.0�� ���
		// ����� ����
		fNum = 30.0f / 3;
		System.out.println(fNum);
		
		//���� 55�� 3�� ���������� ����� �Ǽ��� �ٲ�� ����
		fNum = 55 / 3;
		System.out.println(fNum);
		
	    // 1. 55�� �Ǽ��� ��ȯ
		// 2. 55.0 / 3/0�� ���
		// 3. ����� ������ ����
		fNum = 55 / 3.0f;
		System.out.println(fNum);
		
		
		
		

	}

}
