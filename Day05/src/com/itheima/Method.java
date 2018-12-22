package com.itheima;

/*定义方法*/
public class Method {
	public static void main(String[] args) {
		// 赋值调用
		int s = sum(10, 20);
		// 输出结果
		System.out.println("s" + s);
	}

	// 定义方法
	public static int sum(int a, int b) {
		return a + b;
	}

}
