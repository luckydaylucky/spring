package com.itheima02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Reader {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("D:\\aa\\bb\\cc\\a.txt");
		FileOutputStream fos = new FileOutputStream("a.txt");
		byte[] bys = new byte[1024];
		int len;
		while ((len=fis.read(bys))!=-1) {
			fos.write(bys,0,len);
			
		}
		
		fos.close();
		fos.close();
		
		
		
//		File f1 = new File("d:\\b.txt");
//		boolean createNewFile = f1.createNewFile();
//		FileInputStream fis = new FileInputStream("b.txt");
//		byte[] bys = new byte[1024];
//		int len;
//		while ((len=fis.read(bys))!=-1) {
//			System.out.println(new String(bys,0,len));
//			
//		}
//		fis.close();
		
		
		
//		FileInputStream fil = new FileInputStream("aa.txt");
//		int by;
//		while ((by=fil.read())!=-1) {
//			System.out.print((char)by);
//			
//		}
//		fil.close();
		
		
		
		
		
		
		
//		FileOutputStream fol = new FileOutputStream("d:\\z.txt");
//		try {
//			fol.write("wlwijwjlwjw".getBytes());
//		} catch (Exception e) {
//			
//			e.printStackTrace();
//		}finally {
//			if(fol!=null) {
//				try {
//					fol.close();
//				}catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//		}
		
		
		
		
		
//		FileOutputStream fol = new FileOutputStream("a.txt",true);
//		
//		for (int i = 0; i < 10; i++) {
//			
//			fol.write("jlljlijlej".getBytes());
//			fol.write("\r\n".getBytes());
//		}
//		fol.close();
		
		
//		FileOutputStream fos = new FileOutputStream("a.txt");
		
//		fos.write(62);
//		fos.write(66);
//		fos.write("sjfslfjlsfj".getBytes());
//		fos.write("slfjslfsieeeww".getBytes(), 1, 6);
//		
//		fos.close();
		
		
	}

}
