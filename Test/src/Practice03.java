import java.util.Scanner;

public class Practice03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		System.out.println("����������");
		arr[0] = sc.nextInt();
		System.out.println("������ڶ�������");
		arr[1] = sc.nextInt();
		System.out.println("���������������");
		arr[2] = sc.nextInt();
		
		int max = arr[0];
		if(max<arr[1]) {
			max = arr[1];
		}
		if(max<arr[2]) {
			max = arr[2];
		}
		System.out.println("max:"+max);
		
	}

}
