
public class Dog extends Animal{

	Dog(int age, String name, String sex) {
		super(age, name, sex);
	}

	@Override
	public void eat() {
		System.out.println("¬r¬r");
	}

	@Override
	public void say() {
		System.out.println("¸Û¸Û");
	}

}
