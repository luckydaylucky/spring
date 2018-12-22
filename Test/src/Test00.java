import java.util.Arrays;
import java.util.Random;

public class Test00 {
	public static void main(String[] args) {
		int[] arr = new int[8];
		Random rd = new Random();
		for (int i = 0; i < arr.length; i++) {
			int num = rd.nextInt(16)+15;
			arr[i] = num;
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i=0,j=arr.length-1;i<j;i++,j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
}
	
	

}
