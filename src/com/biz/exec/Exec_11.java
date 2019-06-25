package com.biz.exec;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exec_11 {

	public static void main(String[] args) {

		String fileName = "data.txt";
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String reader="";
		while(true) {
			try {
				reader = buffer.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(reader==null) break;
			System.out.println(reader);
			
		}
	}

	}


