import java.util.Arrays;

public class Practice21 {
	public static void main(String[] args) {
		String str = "goOd gooD stUdy dAy dAy up";
//		第一步先把所有的字符都转换成小写
		str = str.toLowerCase();
		System.out.println(str);
//		第二部切割字符串，用空格去切
		String[] split = str.split(" ");
		System.out.println(Arrays.toString(split));
	
//		把首字母，也就是索引 为0的字母给了ch，并转成大写
		for (int i = 0; i < split.length; i++) {
			String s = split[i];
			char ch = s.charAt(0);
			ch = 32;
			
		
//			从索引为1的字符开始截取，到最后
			String substring = s.substring(1);
//			把调整好的字符串，再放回数组
			split[i] = ch+substring;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < split.length; i++) {
			if(i==split.length-1) {
				sb.append(split);
			}else {
				sb.append(split[i]).append(" ");
			}
		}
		System.out.println(sb);
		
		}
//		把数组的元素拼接成字符串
		
	}


