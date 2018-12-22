
public class Test04 {
	public static void main(String[] args) {
		String str = "6ab11c333def521gh9i5jk61nm3n2";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch>='0'&&ch<='9') {
				sb.append(ch);
			}else {
				sb.append(" ");
			}
		}
		String s = sb.toString();
		String[] split = s.split(" ");
		int sum = 0;
		for(int i = 0; i < split.length; i++) {
			String num = split[i];
			if(!num.equals("")) {
				sum+=Integer.parseInt(num);
			}
		}
		System.out.println(sum);
	}

}
