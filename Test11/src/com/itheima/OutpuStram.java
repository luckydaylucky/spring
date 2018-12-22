package com.itheima;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutpuStram {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("a.txt",true);
		
		for(int i=0; i<10; i++) {
			fos.write("helloworld".getBytes());
			fos.write("\r\n".getBytes());
		}
		fos.close();
	}

}
