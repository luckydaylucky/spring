
public class Practice33 {
	public static void main(String[] args) {
		String[] arr={"am","ieh","ia","ow" };
		for (int i = 0; i < arr.length; i++) {
			StringBuilder sb = new StringBuilder();
			arr[i] = sb.reverse().toString();
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
			
		}
		
		
	}

}
