package com.itheima03;

import java.awt.event.FocusEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

public class DemoTest {
	public static void main(String[] args) throws IOException {
		HashSet<Character> ha = new HashSet<>();
		String s = "aaaaaaaaaaabbbbbbbbbbbbccdefg";
		FileInputStream fis = new FileInputStream("info.txt");
		
		
		int len;
		while ((len=fis.read())!=-1) {
			ha.add((char)len);
			
		}
		FileOutputStream fos = new FileOutputStream("info1.txt");
		Iterator<Character> it = ha.iterator();
		while (it.hasNext()) {
			char c = it.next();
			fos.write(c);
			
			
		}
		fis.close();
		fos.close();
		
	}

}
