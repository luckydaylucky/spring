import java.util.Arrays;

public class Practice21 {
	public static void main(String[] args) {
		String str = "goOd gooD stUdy dAy dAy up";
//		��һ���Ȱ����е��ַ���ת����Сд
		str = str.toLowerCase();
		System.out.println(str);
//		�ڶ����и��ַ������ÿո�ȥ��
		String[] split = str.split(" ");
		System.out.println(Arrays.toString(split));
	
//		������ĸ��Ҳ�������� Ϊ0����ĸ����ch����ת�ɴ�д
		for (int i = 0; i < split.length; i++) {
			String s = split[i];
			char ch = s.charAt(0);
			ch = 32;
			
		
//			������Ϊ1���ַ���ʼ��ȡ�������
			String substring = s.substring(1);
//			�ѵ����õ��ַ������ٷŻ�����
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
//		�������Ԫ��ƴ�ӳ��ַ���
		
	}


