package com.itheima;

public class ArrayDemo {
	public static void main(String[] args) {
////		定义数组格式
//		int[] arr = new int[3];
////		获取数组名和数组中的数
//		System.out.println("arr"+arr);
//		System.out.println("arr[0]"+arr[0]);
//		System.out.println("arr[1]"+arr[1]);
//		System.out.println("arr[2]"+arr[2]);
//		System.out.println("-------------");
//		
////		给数组中的元素赋值
//		arr[0] = 100;
////		输出结果
//		System.out.println("arr[0]"+arr[0]);
//		定义两个数组
//		int[] arr = new int[3];
//		int[] rr = new int[6];
//		输出数组名以及数组中的元素
//		System.out.println("arr1"+arr);
//		System.out.println("arr[0]"+arr[0]);
//		System.out.println("arr[1]"+arr[1]);
//		System.out.println("arr[2]"+arr[2]);
//		System.out.println("-------------");
//		System.out.println("arr2"+rr);
//		System.out.println("arr[0]"+arr[0]);
//		System.out.println("arr[1]"+arr[1]);
//		System.out.println("arr[2]"+arr[2]);
//		System.out.println("arr[3]"+arr[3]);
//		System.out.println("arr[4]"+arr[4]);
//		System.out.println("arr[5]"+arr[5]);
//		定义一个数组
//		int[] arr = {1,2,3,5,798,45,355,225};
//		输出数组中的元素
//		用获取数组的属性 数组名.length
//		for(int x=0; x<arr.length; x++) {
//			System.out.println("数组中有"+arr.length+"个元素");
//			System.out.println(arr[x]);
//		定义一个数组
		int[] arr = {12,63,52,44,100};
//		确定参照物
		int max= arr[0];
//		采用for循环做数组遍历
		
		for(int x=1; x<arr.length; x++) {
//			采用if结构做数组排序的比较
			if(arr[x] > max) {
//				如果元素比max大，那么它就留下来当参照物
				max = arr[x];
			}
			System.out.println("max:"+max);
		}
		
		
	}

}
