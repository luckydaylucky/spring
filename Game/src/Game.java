
public class Game {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
//		method();
		method2();
		
		long end = System.currentTimeMillis();
		System.out.println("����ʱ"+(end-start)+"����");
	}
	public static void method() {
		int sum = 0;
		for (int i = 1; i <= 100000000; i++) {
			
			sum = sum + i;
			
		}
		System.out.println(sum);
	}
	public static void method2() {
		int i = 0;
		int sum = 0;
		int n = 100000000;
		sum = (1+n)*n/2;
		System.out.println(sum);
	}
	

}
