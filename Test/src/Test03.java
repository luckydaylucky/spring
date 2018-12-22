
public class Test03 {
	public static void main(String[] args) {
		String[] arr = {"am","ieh","ia","ow"};
		
		for (int i = 0; i < arr.length; i++) {
			String s = arr[i];
			
			StringBuilder sb = new StringBuilder(s);
			arr[i] = sb.reverse().toString();
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
		}
		System.out.println(sb);
	}

}
