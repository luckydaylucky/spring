package Practice;

import java.util.Random;
import java.util.Scanner;

/*
 * ���󣺲�������Ϸ
 */

public class Practice {
	
	public static void main(String[] args) {
		// ϵͳ����һ�������
		Random r = new Random();
		int number = r.nextInt(100) + 1;
		// ����������¼�����
		Scanner sc = new Scanner(System.in);
		// ������ʾ

		// ����forѭ��
		for (int i = 1; i <= 100; i++) {
			System.out.println("������һ������:");
			int gussNumber = sc.nextInt();

			// ������
			if (gussNumber > number) {
				System.out.println("��µ�����:" + gussNumber + "����");
			} else if (gussNumber < number) {
				System.out.println("��µ�����:" + gussNumber + "С��");
			} else {
				System.out.println("��ϲ��¶��ˣ�");
			}
		}
	}
}
