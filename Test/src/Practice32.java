
public class Practice32 {
	public static void main(String[] args) {
		String str = "heimaheimawoaiheima,buguanheimahaishibaima,zhaodaogongzuojiushihaoma"; 
		int count = 0;
		while (str.contains("heima")) {
			str = str.replaceFirst("heima", "");
			str = str.replaceFirst("heima", "#");
			count++;
		}
		System.out.println(count);
	}

}