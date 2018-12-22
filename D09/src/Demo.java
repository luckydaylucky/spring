
public class Demo {
	public static void main(String[] args) {
		Dog d = new Dog("´ó»Æ",3);
//		d.setName("´ó»Æ");
//		d.setAge(3);
		
		System.out.println(d.getName()+"------"+d.getAge());
		System.out.println(d.toString());
		Dog d1 = new Dog();
		System.out.println(d.equals(d1));
		
	}

}
