import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		String str = "goOd gooD stUdy dAy dAy up";
		str = str.toLowerCase();
		System.out.println(str);
		
		String[] split = str.split(" ");
		System.out.println(Arrays.toString(split));
		
		for (int i = 0; i < split.length; i++) {
			
		}
	}

}
