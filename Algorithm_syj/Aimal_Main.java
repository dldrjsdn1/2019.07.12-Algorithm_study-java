
public class Aimal_Main {

	public static void main(String[] args) {
		Human human1 = new Human(20, "유진", "f");
		Dog dog1 = new Dog(3, "준서", "m");
		Cat cat1 = new Cat(7, "건우", "f");
		
		human1.eat();
		human1.say();
		
		dog1.eat();
		dog1.say();
		
		cat1.eat();
		cat1.say();
		
	}

}

