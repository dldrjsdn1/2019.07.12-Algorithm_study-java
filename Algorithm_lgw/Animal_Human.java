
public class Animal_Human extends Animal{
	

	Animal_Human(String name, int age, String sex) {
		super(name, age, sex);
		System.out.println(name +age +sex);
	}

	@Override
	public void eat() {
		System.out.println("밥을 먹는다.");
	}
	@Override
	public void speack() {
		System.out.println("가나다라마사바");
	}
	
	public void thinking() {
		System.out.println("사람은 생각을 할 수 있다.");
	}

}
