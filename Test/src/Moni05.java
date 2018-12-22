import java.util.ArrayList;
import java.util.HashSet;

public class Moni05 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("abc");
		list.add("abc");
		list.add("abc");
		list.add("abc");
		list.add("abc");
		list.add("abc");
		list.add("abc");
		list.add("cba");
		list.add("cba");
		list.add("cba");
		list.add("cba");
		list.add("cba");
		list.add("cba");
		HashSet<String>set = new HashSet<>(list);
		ArrayList<String>list2 = new ArrayList<>(set);
		System.out.println(list2);
	}

}
