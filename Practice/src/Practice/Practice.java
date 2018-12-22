package Practice;

import java.util.Random;
import java.util.Scanner;

/*
 * 需求：猜数字游戏
 */

public class Practice {
	
	public static void main(String[] args) {
		// 系统产生一个随机数
		Random r = new Random();
		int number = r.nextInt(100) + 1;
		// 创建键盘那录入对象
		Scanner sc = new Scanner(System.in);
		// 给出提示

		// 加入for循环
		for (int i = 1; i <= 100; i++) {
			System.out.println("请输入一个整数:");
			int gussNumber = sc.nextInt();

			// 猜数字
			if (gussNumber > number) {
				System.out.println("你猜得数字:" + gussNumber + "大了");
			} else if (gussNumber < number) {
				System.out.println("你猜得数字:" + gussNumber + "小了");
			} else {
				System.out.println("恭喜你猜对了！");
			}
		}
	}
}
