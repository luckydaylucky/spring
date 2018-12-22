package com.itheima03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("d:\\php.txt");
		FileOutputStream fos = new FileOutputStream("php.txt");
		
		byte[] bys = new byte[1024];
		int len;
		while ((len = fis.read(bys))!=-1) {
			fos.write(bys,0,len);
			
		}
		fos.close();
		fis.close();
		
		
//		File f1 = new File("d:\\php.txt");
//		boolean createNewFile = f1.createNewFile();
//		System.out.println(createNewFile);
	}

}
