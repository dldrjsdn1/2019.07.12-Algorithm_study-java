
public class Person_main {

	public static void main(String[] args) {

		Person1 p1 = new Person1();
		Person1 p2 = new Person1(40, 'm', "서울");
		Person1 p3 = new Person1();

		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(p1 == p3);

		p2.setAge(30);
		p2.setSex('f');
		p2.setAddress("부천");

		System.out.println(p2.toString());
		p2.hello();
		
	}

}
