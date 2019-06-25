package com.biz.exec;

import com.biz.exec.model.StudentVO;

public class Exec_08 {

	public static void main(String[] args) {

		StudentVO[] stdList = new StudentVO[10];
		
	
			stdList[1] = new StudentVO();
		
		
		
		stdList[1].number = "002";
		stdList[1].name = "성춘향";
		
		System.out.println(stdList[1].number);
		System.out.println(stdList[1].name);
	}

}
