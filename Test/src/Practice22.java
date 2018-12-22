import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Practice22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		
		while (true) {
			String s = sc.nextLine();
			
			if(s.equals("end")) {
				break;
			}
			
		}
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
	}

}
