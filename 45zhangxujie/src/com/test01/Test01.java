package com.test01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Test01 {
	public static void main(String[] args) throws IOException {
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			int rr = r.nextInt(49)+32;
			int[] arr = new int[rr];
			System.out.println(rr);
		}
		
		int ss = 0;
		if (ss%2==0) {
			ArrayList<Integer> list = new ArrayList<>();
			list.add(ss);
			
		}else {
			ArrayList<Integer> list2 = new ArrayList<>();
			list2.add(ss);
		}
		BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
		
		
		bw.newLine();
		bw.flush();
		bw.close();
		
				
	}
	
	

}
