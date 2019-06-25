package com.biz.exec;

public class Exec_04 {

	public static void main(String[] args) {

		//1~100까지 정수를 덧셈하여 콘솔에 결과를 출력
		
		int total=0;
		for (int i=1; i<=100;i++) {			
			total += i;
		}
		System.out.println("1~100까지의 합은" + total);
	}

}
