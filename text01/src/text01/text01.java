package text01;

import java.awt.Frame;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Random;

import javax.security.auth.x500.X500Principal;

/**
 * 随机生成10个50到80之间的数字存入数组arr  创建两个集合奇偶将两个集合的元素分别输出到a.txt
 * @author MR.z
 *
 */
public class text01 {
	public static void main(String[] args) throws IOException {
		int[] arr = new int[10];
		//生成随机数
		for(int i=0;i<arr.length;i++) {
		Random random=new Random();
		
		int number=random.nextInt(31)+50;
//		System.out.println(number);
		arr[i] = number;

		}
		
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list1 = new ArrayList<>();
		for(int i = 0; i<arr.length; i++) {
			if(i%2==0) {
				list.add(i);
			}else {
				list1.add(i);
			}
		}
		StringBuilder sb = new StringBuilder();
		
		sb.append();
		
		
	
	
		
	}
		
		
		
		
		
	}


