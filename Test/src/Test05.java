
public class Test05 {
	public static void main(String[] args) {

		String big = "afjajfajfoljisojfos";
		String small = "abc";
		int count = 0;
		while (big.contains(small)) {
			big = big.replace(small, "@");
			count++;
			
			
		}
		System.out.println(count);
	}

}
