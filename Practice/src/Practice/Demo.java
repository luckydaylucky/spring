package Practice;

public class Demo {
	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder();
//		sb.append("������������");
//		sb.append("�����л�");
//		sb.append("�й�ΰ��");
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
