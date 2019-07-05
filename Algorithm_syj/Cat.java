
public class Cat extends Animal{

	Cat(int age, String name, String sex) {
		super(age, name, sex);
	}

	@Override
	public void eat() {
		System.out.println("Ãò¸¨Ãò·ì");
	}

	@Override
	public void say() {
		System.out.println("³Ä¾Æ¿Ë");
	}

}
