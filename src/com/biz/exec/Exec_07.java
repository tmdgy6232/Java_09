package com.biz.exec;

import com.biz.exec.model.StudentVO;

public class Exec_07 {

	public static void main(String[] args) {

		//문법오류를 잠시 보류하는 효과
		StudentVO studentVO = null;
		
		studentVO = new StudentVO();
		
		
		studentVO.number = "001";
		studentVO.name = "홍길동";
	}

}
