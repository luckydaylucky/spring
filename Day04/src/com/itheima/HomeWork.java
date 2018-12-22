package com.itheima;


import java.util.Random;
import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
		
		
		
		
		/*将数字1-10保存到一个长度为10的一维数组中
		定义一个新数组,长度为3,取出原来数组中随机三个元素(不考虑是否重复)
		给新数组的元素赋值
		求新数组所有元素的和*/
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int[] arrs = new int[3];
//		创建随机数
		Random r = new Random();
		int num = r.nextInt(10);
		
	
		
		
		
		
		
		
		
		
//		定义数组
//		int[] arr = new int[20];
//		arr[0] = 1;
//		arr[1] = 1;
//		for (int i = 2; i < arr.length; i++) {
//			arr[i] = arr[i-1] +arr[i-2];
//		}
//		System.out.println(arr[19]);
		
		
		
		
		/*在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。
		选手的最后得分为：去掉一个最高分和一个最低分后 的4个评委平均值。
		请写代码实现。(不考虑小数部分)*/
//		定义数组
//		int[] arr = new int[6];
//		创建键盘录入对象
//		Scanner sc = new Scanner(System.in);
//		for (int i = 0; i < arr.length; i++) {
//			给出提示
//			System.out.println("请输入第"+(i+1)+"评委打分");
//			int num = sc.nextInt();
//			arr[i] = num;
//		}
//		创建参照对象
//		int max = arr[0];
//		int min = arr[0];
//		求最大值
//		for (int i = 1; i < arr.length; i++) {
//			if(max > arr[i]) {
//				max = arr[i];
//			}
//		}
//		求最小值
//		for (int i = 0; i < arr.length; i++) {
//			if(min < arr[i]) {
//				min = arr[i];
//			}
//		}
		
//		定义求和变量
//		int sum = 0;
//		for (int i = 0; i < arr.length; i++) {
//			sum += arr[i];
//		}
//		定义平均分变量
//		int avg = 0;
//		 
//		for (int i = 0; i < arr.length; i++) {
//			avg = (sum - max - min)/(arr.length-2);
//		}
//		System.out.println("该选手的最终得分是"+avg);	
		
		
		
		
		
		
		/*键盘录入一个整数，创建一个该长度的数组，
		为每一个元素赋值为1-10的随机整数，
		最后打印数组中所有值大于5且为偶数的元素.*/
//		定义数组
//		int[] arr = new int[10];
//		创建随机数对象
//		Random r = new Random();
//		获取到的随机数是
//		for (int i = 0; i < arr.length; i++) {
//			定义一个10以内的随机数
//			int num = r.nextInt(10);
//			arr[i] = num;
//			加入if判断
//			if(arr[i]>5 && arr[i]%2==0) {
//				System.out.println(num);
//			}
//		}
		
		
		
		
		
		/*已知数组int[] nums = {5,10,15},,要求创建一个新数组
				1.新数组的长度和已知数组相同
				2.新数组每个元素的值 是已知数组对应位置元素的2倍
				3.在控制台中打印新数组的所有元素*/
//		数组中元素个数是数组长度-1
//		int[] nums = {5,10,15};
//		int[] arr = new int[3];
//		arr[0] = nums[0]*2;
//		arr[1] = nums[1]*2;
//		arr[2] = nums[2]*2;
//		System.out.println("arr[0]"+arr[0]);
//		System.out.println("arr[1]"+arr[1]);
//		System.out.println("arr[2]"+arr[2]);
		
		

		
		
		
		
//		定义数组
//		int[] arr = new int[3];
//		创建随机数对象
//		Random r = new Random();
//		获取到的随机数是
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("获取到的随机数是");
//			int num = r.nextInt(9);
//			
//			arr[i] = num;
//			System.out.println(arr[i]);
//		}
		
		
		
		
		
		
		
//		定义一个数组
//		int[] arr = {19,95,65,45,89};
//		int min = arr[0];
//		利用遍历求出数组中的元素
//		for (int i = 1; i < arr.length; i++) {
//			定义参照物
			
//			if(min > arr[i]) {
//				min = arr[i];
//				
//				
//			}	
//		}
//		System.out.println(min);
		
		
		
		
		
		
		
//		模拟评委打分程序
//		定义数组
//		int[] arr = new int[6];
//		创建键盘录入对象
//		Scanner sc = new Scanner(System.in);
		
//		给出提示
//		获取数组中的分数
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("请输入第"+(i+1)+"评委的分数");
//			int score = sc.nextInt();
//			arr[i] = score;
//		}
//		定义评分参照物
//		int max = arr[0];
//		int min = arr[0];
//		求分数中的最大值
//		for (int i = 0; i < arr.length; i++) {
//			if(max < arr[i]) {
//				max = arr[i];
//			}
//		}
		
//		求分数中的最小值
//		for (int i = 0; i < arr.length; i++) {
//			if(min > arr[i]) {
//				min = arr[i];
//			}
			
//			定义求和变量
			
			
//		}
//		int sum = 0;
//		for (int i = 0; i < arr.length; i++) {
//			sum += arr[i];
//		}
//		定义平均分变量
//		int avg = (sum - max - min)/(arr.length-2);
//		输出结果
//		System.out.println("该选手的最终得分是:"+avg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		定义数组
//		int[] arr = new int[20];
//		给数组赋值
//		arr[0] = 1;
//		arr[1] = 1;
//		采用for循环做数组练习
//		按规律从第三个月开始
//		for (int i = 2; i < arr.length; i++) {
//			arr[i] = arr[i-1] + arr[i-2];
//		}
//		System.out.println("第二十个月的兔子个数是"+arr[19]);
	}

}
