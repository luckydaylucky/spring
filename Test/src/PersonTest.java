import java.util.ArrayList;
import java.util.Iterator;

public class PersonTest {
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<>();
		Person p1 = new Person("����",23);
		Person p2 = new Person("����",24);
		Person p3 = new Person("����",25);
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		for (Person person : list) {
			System.out.println(person.getName()+"   "+person.getAge());
			person.eat();
			person.slleep();
		}
		
		
	}

}
