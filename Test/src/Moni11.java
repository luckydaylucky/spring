import java.util.Arrays;
import java.util.Random;

import javax.naming.ldap.Rdn;

public class Moni11 {
	public static void main(String[] args) {
		int[] arr = new int[8];
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			int num = r.nextInt(16)+15;
			arr[i] = num;
		}
		System.out.println(Arrays.toString(arr));
		for(int i=0,j=arr.length-1;i<j;i++,j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
