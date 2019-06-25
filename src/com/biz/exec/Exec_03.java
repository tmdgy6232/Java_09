package com.biz.exec;

import java.util.Random;

public class Exec_03 {

	public static void main(String[] args) {

		Random rnd = new Random();
		
		int i = rnd.nextInt(1000);

		if(i%2 ==0) System.out.println("짝수입니다.");
		else System.out.println("홀수입니다.");
		
	}

}
