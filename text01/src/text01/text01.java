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
 * �������10��50��80֮������ִ�������arr  ��������������ż���������ϵ�Ԫ�طֱ������a.txt
 * @author MR.z
 *
 */
public class text01 {
	public static void main(String[] args) throws IOException {
		int[] arr = new int[10];
		//���������
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

