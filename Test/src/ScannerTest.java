import java.util.Arrays;
import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		int[] arr = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数");
		arr[0] = sc.nextInt();
		
		System.out.println("请输入第二个数");
		arr[1] = sc.nextInt();
		System.out.println("请输入第三个数");
		arr[2] = sc.nextInt();
		
		
		Arrays.sort(arr);
		System.out.println(arr);
		
		
//		int max = arr[0];
//		for (int i = 0; i < arr.length; i++) {
//			if(max<arr[i]) {
//				max = arr[i];
//				
//			}
			
		}
		
		
		
		
		
		
	}


