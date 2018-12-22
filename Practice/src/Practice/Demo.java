package Practice;

public class Demo {
	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder();
//		sb.append("啦啦啦啦啦你");
//		sb.append("爱我中华");
//		sb.append("中国伟大");
//		
//		
//		
//		sb.reverse();
//		System.out.println(sb);
		
		int[] arr = {1,2,3};
		String result = arrayToString(arr);
		System.out.println(result);
		
		
	}
	public static String arrayToString(int[] arr) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if(i==arr.length-1) {
				sb.append(arr[i]);
			}else {
				sb.append(arr[i]).append(", ");
			}
		}
		sb.append("]");
		
		String s = sb.toString();
		return s;
	}

}
