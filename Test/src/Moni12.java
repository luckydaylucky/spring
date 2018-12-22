
public class Moni12 {
	public static void main(String[] args) {
		String s = "faflafiijlejfle";
		String ss = "$$$";
		
		
	}
	public static String replace(String desc,String oldStr,String newStr) {
		while(desc.contains(oldStr)) {
			int indexOf = desc.indexOf(oldStr);
			String substring = desc.substring(0, indexOf);
			
			System.out.println(qian);
			desc.substring(indexOf+oldStr.length());
			
			System.out.println(hou);
			desc = qian+newStr+hou;
		}
		return desc;
		
	}
	
}
