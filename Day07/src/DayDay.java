import java.util.Scanner;

public class DayDay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ����");
		int a = sc.nextInt();
		
		System.out.println("������ڶ�������");
		int b = sc.nextInt();
		
		System.out.println("���������������");
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
