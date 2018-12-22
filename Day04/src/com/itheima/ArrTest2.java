package com.itheima;
/*需求：有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 小兔子长到第三个月后每个月又生一对兔子，
* 假如兔子都不死，问第二十个月的兔子对数为多少？ 
* 
* 规律：
* 		第一个月：1
* 		第二个月：1
* 		第三个月：2
* 		第四个月：3
* 		第五个月：5
* 		...
* 
* 		从第三个月开始，每个月的兔子对数是前两个月的兔子对数之和
* 		第一个月和第二个月的兔子对数都是1*/

import java.util.Scanner;

public class ArrTest2 {
	public static void main(String[] args) {
//		定义一个数组
		int[] arr = new int[20];
//		创建键盘录入对象
//		Scanner sc = new Scanner(System.in);
//		给出提示
//		System.out.println("请输入你要知道几月兔子的数量:");
//		int sum = sc.nextInt();
		arr[0] = 1;
		arr[1] = 2;
		for(int x=2; x<arr.length; x++) {
			arr[x] = arr[x-1] + arr[x-2];
		}
		System.out.println("第二十个月的兔子是："+arr[19]);
		
		
	}

}
