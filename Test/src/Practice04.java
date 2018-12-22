import java.util.HashMap;

public class Practice04 {
	public static void main(String[] args) {
		String str = "aaabcdeeefgdhigklmmmnnn";
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(map.containsKey(ch)) {
				Integer count = map.get(ch);
				map.put(ch, ++count);
			}else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
	}

}
