package com.itheima03;

import java.awt.event.FocusEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Home1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("d:\\php.txt");
		FileOutputStream fos = new FileOutputStream("php.txt");
		byte[] bys = new byte[1024];
		int len;
		while ((len = fis.read(bys))!=-1) {
			fos.write(bys,0,len);
			
		}
		fis.close();
		fos.close();
	}

}
