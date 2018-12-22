import java.util.Scanner;

public class DayDay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数");
		int a = sc.nextInt();
		
		System.out.println("请输入第二个数字");
		int b = sc.nextInt();
		
		System.out.println("请输入第三个数字");
		int c = sc.nextInt();
		
		int max = a;
		if(max > b) {
			max = b;
			System.out.println(max);
		}else if(max>c) {
			max = c;
			System.out.println(max);
		}
		
		
	}

}
